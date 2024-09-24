// Input : 
// N = 5
// A[] = {-8, 2, 3, -6, 10}
// K = 2
// Output : 
// -8 0 -6 -6
// Explanation :
// First negative integer for each window of size k
// {-8, 2} = -8
// {2, 3} = 0 (does not contain a negative integer)
// {3, -6} = -6
// {-6, 10} = -6



// gives tle
class Compute {
    public long isnegative(ArrayList<Long>list){
        for(long x:list){
            if(x<0)return x;
        }
        return 0;
    }
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long ans[]=new long[N-K+1];
        int idx=0;
        int i=0;
        int j=0;
        ArrayList<Long>list=new ArrayList<>(); 
        while(j<N){
            list.add(A[j]);
            if(j-i+1==K){
                long temp=isnegative(list);
                ans[idx++]=temp;
                list.remove(list.get(0));
                i++;
            }
            j++;
        }
        return ans;
    }
}


//use deque to remove TLE
class Compute {
    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        long[] ans = new long[N - K + 1];
        int idx = 0;
        Deque<Integer> deque = new LinkedList<>();
        int i = 0, j = 0;
        while (j < N) {
            if (A[j] < 0) {
                deque.addLast(j);
            }
            if (j - i + 1 == K) {
                if (!deque.isEmpty()) {
                    ans[idx++] = A[deque.peekFirst()];
                } else {
                    ans[idx++] = 0;
                }
                if (!deque.isEmpty() && deque.peekFirst() == i) {
                    deque.removeFirst();
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}

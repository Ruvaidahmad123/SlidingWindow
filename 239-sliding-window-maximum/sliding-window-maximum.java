class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>(); 
        int i=0;
        int j=0;
        int ans[]=new int[nums.length-k+1];
        int ptr=0;
        while(j<nums.length){
            while(!q.isEmpty() && q.peekLast()<nums[j]){
                q.pollLast();
            }
            q.add(nums[j]);
            if(j-i+1<k)j++;
            else if(j-i+1==k){
                ans[ptr++]=q.peek();
                if(nums[i]==q.peek()){
                    q.pollFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
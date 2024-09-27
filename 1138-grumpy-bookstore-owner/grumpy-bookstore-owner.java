class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=grumpy.length;
        int curr_unsatisfied=0;
        for(int i=0;i<minutes;i++){
            curr_unsatisfied+=grumpy[i]*customers[i];
        }
        int max_unsatisfied=curr_unsatisfied;
        int j=minutes;
        int i=0;
        while(j<n){
            curr_unsatisfied-=grumpy[i]*customers[i];
            curr_unsatisfied+=grumpy[j]*customers[j];
            max_unsatisfied=Math.max(max_unsatisfied,curr_unsatisfied);
            i++;
            j++;
        }
        for(i=0;i<n;i++){
            if(grumpy[i]==0){
                max_unsatisfied+=customers[i];
            }
        }
        return max_unsatisfied;
    }
}
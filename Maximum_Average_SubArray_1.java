class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int sum=0;
        double avg=Integer.MIN_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1==k){
                avg=Math.max(avg,(double)sum/k);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return avg;
    }
}

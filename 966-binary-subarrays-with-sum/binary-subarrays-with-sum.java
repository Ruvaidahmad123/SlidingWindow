class Solution {
    public int getAns(int[] nums, int goal){
        if(goal<0)return 0;
        int i=0;
        int j=0;
        int sum=0;
        int max=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }   
            max+=j-i+1; //get all subarrays with sum<=goal
            j++;
        }
        return max;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
            //get all subarrays with sum<=goal - get all subarrays with sum<goal
        return getAns(nums,goal)-getAns(nums,goal-1);
    }
}
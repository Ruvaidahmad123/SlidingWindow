class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int countones=0;
        for(int x:nums)countones+=x;
        int i=0;
        int j=0;
        int count=0;
        int ans=0;
        while(j<2*n){
            if(nums[j%n]==1){
                count++;
            }
            while(j-i+1>countones){
                count-=nums[i%n];
                i++;
            }
            ans=Math.max(ans,count);
            j++;
        }
        return countones-ans;
    }
}
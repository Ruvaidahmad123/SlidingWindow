class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0;
        int i=0;
        int j=0;
        int product=1;
        int ans=0;
        while(j<nums.length){
            product=product*nums[j];
            while(product>=k){
                product=product/nums[i];
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}
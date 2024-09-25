class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int rp=1;
        ans[0]=rp;
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            ans[i]=rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            ans[i]*=rp;
        }
        return ans;
    }
}
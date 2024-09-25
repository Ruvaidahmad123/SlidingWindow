class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        long pre[]=new long[n];
        long suf[]=new long[n];
        long rp=1;
        pre[0]=rp;
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            pre[i]=rp;
        }
        rp=1;
        suf[n-1]=rp;
        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            suf[i]=rp;
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=(int)(pre[i]*suf[i]);
        }
        return ans;
    }
}
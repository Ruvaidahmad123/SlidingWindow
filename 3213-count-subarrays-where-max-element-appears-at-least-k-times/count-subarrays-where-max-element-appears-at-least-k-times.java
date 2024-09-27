class Solution {
    public long countSubarrays(int[] nums, int k) {
        long count=0;
        int i=0;
        int j=0;
        long max=0;
        long ans=0;
        for(int x:nums)max=Math.max(max,x);
        while(j<nums.length){
            if(nums[j]==max){
                count++;
            }
            while(count>=k){
                ans+=nums.length-j; //kyuki agar j tak valid subarray(maxelefreq==k) hai toh n tak bhi hoga toh aur n-j mil jayega
                if(nums[i]==max){
                    count--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
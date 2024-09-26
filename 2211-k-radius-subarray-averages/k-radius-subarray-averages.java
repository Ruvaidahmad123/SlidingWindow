class Solution {
    public int[] getAverages(int[] nums, int k) {
        int average[]=new int[nums.length];
        Arrays.fill(average,-1);
        if(nums.length<2*k+1)return average;
        int length=2*k+1;
        int i=0;
        int j=0;
        long sum=0;
        while(j<nums.length){
            sum+=nums[j];
            if((j-i+1)==length){
                int idx=(i+j)/2;
                average[idx]=(int)(sum/length);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return average;
    }
}
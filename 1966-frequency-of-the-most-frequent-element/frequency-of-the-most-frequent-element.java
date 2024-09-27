class Solution {
    public int binarySearch(int targetidx,int k,long[] prefix,int nums[]){
        int maxfreq=0;
        int i=0;
        int j=targetidx;
        int maxbelow=targetidx;
        while(i<=j){
            int mid=i+(j-i)/2;
            long count=targetidx-mid+1;
            long windowsum=count*nums[targetidx];
            long currsum=prefix[targetidx]-prefix[mid]+nums[mid];
            if((int)(windowsum-currsum)>k){
                i=mid+1;
            }
            else{
                maxbelow=mid;
                j=mid-1;
            }
        }
        return targetidx-maxbelow+1;
    }
    public int maxFrequency(int[] nums, int k) {
        int result=0;
        int n=nums.length;
        Arrays.sort(nums);
        long prefix[]=new long[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
           result=Math.max(result,binarySearch(i,k,prefix,nums)); 
        }
        return result;

    }
}
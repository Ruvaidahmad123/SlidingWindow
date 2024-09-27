//Approach-1 (Using Binary Search)
//T.C : O(nlogn)
//S.C : O(n) for prefixSum for effienctly calculating windowSum
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
    
//Approach-2 (Using sliding window)
//T.C : O(nlogn)
//S.C : O(1)
   public class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        int i = 0;
        long currSum = 0;
        for (int j = 0; j < n; j++) {
            long target = nums[j];
            currSum += nums[j];  
            while ((j - i + 1) * target - currSum > k) {
                currSum -= nums[i];
                i++;
            }   
            result = Math.max(result, j - i + 1);
        }
        return result;
    }
}

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int i=0;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(j<arr.length){
            sum+=arr[j];
            while(sum >= target) {
                min = Math.min(min, j-i+1);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}

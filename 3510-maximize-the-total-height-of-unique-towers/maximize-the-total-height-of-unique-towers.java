class Solution {

    public long maximumTotalSum(int[] maximumHeight) {
        long ans = 0;
        Arrays.sort(maximumHeight);
        long curHeight = Integer.MAX_VALUE;
        for (int i = maximumHeight.length - 1;i >= 0;i --) {
            curHeight = Math.min(curHeight, maximumHeight[i]);
            if (curHeight <= 0) {
                return -1;
            }
            ans += curHeight;
            curHeight--;
        }
        return ans;
    }


}
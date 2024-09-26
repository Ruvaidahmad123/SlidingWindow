class Solution {
    public int pivotIndex(int[] nums) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        int rs=0;
        prefix[0]=rs;
        for(int i=1;i<nums.length;i++){
            rs+=nums[i-1];
            prefix[i]=rs;
        }
        rs=0;
        suffix[nums.length-1]=rs;
        for(int i=nums.length-2;i>=0;i--){
            rs+=nums[i+1];
            suffix[i]=rs;
        }
        for(int i=0;i<nums.length;i++){
            if(prefix[i]==suffix[i]){
                return i;
            }
        }
        return -1;
    }
}
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int prefix[]=new int[nums.length];
        int min=nums[0];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=min;
            min=Math.min(min,nums[i]);
        }
        for(int x:prefix)System.out.print(x+" ");
        int max=nums[nums.length-1];
        int suffix[]=new int[nums.length];
        suffix[nums.length-1]=max;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=max;
            max=Math.max(max,nums[i]);
        }
        System.out.println();
        for(int x:suffix)System.out.print(x+" ");
        for(int i=1;i<nums.length;i++){
            if(nums[i]>prefix[i] && nums[i]<suffix[i] && nums[i]!=prefix[i] && nums[i]!=suffix[i]){
                return true;
            }
        }
        return false;
    }
}
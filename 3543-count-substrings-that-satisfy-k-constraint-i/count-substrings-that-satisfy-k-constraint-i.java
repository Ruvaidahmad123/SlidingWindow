class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int i=0;
        int j=0;
        int count1=0;
        int count0=0;
        int ans=0;
        while(j<n){
            if(s.charAt(j)=='1')count1++;
            if(s.charAt(j)=='0')count0++;
            while(count1>k && count0>k){
                if(s.charAt(i)=='1'){
                    count1--;
                }
                else{
                    count0--;
                }
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}
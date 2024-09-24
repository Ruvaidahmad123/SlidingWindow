class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int maxf=0;
        int map[]=new int[26];
        int ans=0;
        while(j<s.length()){
            map[s.charAt(j)-'A']++;
            maxf=Math.max(maxf,map[s.charAt(j)-'A']);
            while((j-i+1)-maxf>k){
                map[s.charAt(i)-'A']--;
                maxf=0;
                for(int p=0;p<26;p++)maxf=Math.max(maxf,map[p]);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
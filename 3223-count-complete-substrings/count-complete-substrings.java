class Solution {
    public int solve(int start,int end,String word,int k){
        int result=0;
        for(int unique_chars=1;unique_chars<=26 && unique_chars*k<=end-start+1;unique_chars++){
            int count[]=new int[26];
            int goodchar=0;
            int windowlength=unique_chars*k;
            int i=start;
            for(int j=start;j<=end;j++){
                char ch=word.charAt(j);
                count[ch-'a']++;
                if(count[ch-'a']==k){
                    goodchar++;
                }
                else if(count[ch-'a']==k+1){
                    goodchar--;
                }
                if(j-i+1>windowlength){
                    if(count[word.charAt(i)-'a']==k+1){
                        goodchar++;
                    }
                    else if(count[word.charAt(i)-'a']==k){
                        goodchar--;
                    }
                    count[word.charAt(i)-'a']--;
                    i++;
                }
                if(goodchar==unique_chars){
                    result++;
                }
            }
        }
        return result;
    }
    public int countCompleteSubstrings(String word, int k) {
        int n=word.length();
        int result=0;
        int last=0;
        for(int i=1;i<=n;i++){
            if(i==n || Math.abs(word.charAt(i)-word.charAt(i-1))>2){
                result+=solve(last,i-1,word,k);
                last=i;
            }
        }
        return result;
    }
}
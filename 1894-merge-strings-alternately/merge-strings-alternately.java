class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        boolean flag=false;
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            if(flag==false){
                str+=word1.charAt(i);
                flag=true;
                i++;
            }
            else{
                str+=word2.charAt(j);
                flag=false;
                j++;
            }
        }
        while(i<word1.length() ){
            str+=word1.charAt(i);
            i++;
        }
        while(j<word2.length()){
            str+=word2.charAt(j);
            j++;
        }
        return str;
    }
}
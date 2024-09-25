class Solution {
    int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))return "";
        int i=str1.length();
        int j=str2.length();
        int end=gcd(i,j);
        return str1.substring(0,end);
    }
}
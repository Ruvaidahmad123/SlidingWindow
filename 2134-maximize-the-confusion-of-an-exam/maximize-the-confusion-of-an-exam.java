class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i=0;
        int j=0;
        int max=0;
        int countT=0;
        int countF=0;
        while(j<answerKey.length()){
            if(answerKey.charAt(j)=='T')countT++;
            else countF++;
            while(Math.min(countT,countF)>k){
                if(answerKey.charAt(i)=='T')countT--;
                else countF--;
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
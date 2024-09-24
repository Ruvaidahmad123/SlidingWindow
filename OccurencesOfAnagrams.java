// Input:
// txt = forxxorfxdofr
// pat = for
// Output: 3
// Explanation: for, orf and ofr appears
// in the txt, hence answer is 3.

class Solution {
    boolean isAllZeroes(int arr[]){
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    int search(String pat, String txt) {
        int count[]=new int[26];
        Arrays.fill(count, 0);
        for (char ch : pat.toCharArray()) {
            count[ch - 'a']++;
        }
        int ans=0;
        int i=0;
        int j=0;
        while(j<txt.length()){
            int idx = txt.charAt(j) - 'a';
            count[idx]--;
            if(j-i+1==pat.length()){
                if(isAllZeroes(count)){
                    ans++;
                }
                count[txt.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return ans;
    }
}

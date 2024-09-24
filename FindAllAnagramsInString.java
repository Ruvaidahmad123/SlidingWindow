// Example 1:
// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".
class Solution {
    boolean isAllZeroes(int arr[]){
        for (int num : arr) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int count[]=new int[26];
        Arrays.fill(count, 0);
        for (char ch : p.toCharArray()) {
            count[ch - 'a']++;
        }
        int i=0;
        int j=0;
        List<Integer>ans=new ArrayList<>();
        while(j<s.length()){
            int idx = s.charAt(j) - 'a';
            count[idx]--;
            if(j-i+1==p.length()){
                if(isAllZeroes(count)){
                    ans.add(i);
                }
                count[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return ans;
    }
}

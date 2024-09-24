// Example 1:

// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return "";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        int j=0;
        int start_i=0;
        int required_count=t.length();
        int minwindow=Integer.MAX_VALUE;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)&& map.get(ch) > 0){
                required_count--;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            //shrink the window
            while(required_count==0){
                int currentwindow_size=j-i+1;
                if(currentwindow_size<minwindow){
                    minwindow=currentwindow_size;
                    start_i=i;
                }
                char startChar = s.charAt(i);
                map.put(startChar, map.getOrDefault(startChar, 0) + 1);
                if (map.containsKey(startChar) && map.get(startChar) > 0) {
                    required_count++;
                }
                i++;
            }
            j++;
        }
        return minwindow==Integer.MAX_VALUE?"":s.substring(start_i,start_i+minwindow);
    }
}

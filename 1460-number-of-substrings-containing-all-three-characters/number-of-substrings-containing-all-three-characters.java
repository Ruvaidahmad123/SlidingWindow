class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int j=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int ans=0;
        while(j<s.length()){
            if(s.charAt(j)=='a'||s.charAt(j)=='b'||s.charAt(j)=='c'){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            }
            while(map.size()==3){
                ans+=s.length()-j;
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
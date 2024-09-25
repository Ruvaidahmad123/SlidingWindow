class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:sentence.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map.size()==26?true:false;
    }
}
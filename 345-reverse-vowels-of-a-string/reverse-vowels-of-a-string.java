class Solution {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String reverseVowels(String s) {
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.reverse(list);
        int idx=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i]=list.get(idx++);
            }
        }
        return new String(arr);
    }
}
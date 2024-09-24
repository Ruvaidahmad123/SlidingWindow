class Solution {
    public static int totalFruits(Integer[] arr) {
        int i=0;
        int j=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        while(j<arr.length){
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            while(map.size()>2){
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }
            max=Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}

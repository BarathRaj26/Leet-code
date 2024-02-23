class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> occurrences = new HashSet<>();
        for (int count : map.values()) {
            if (!occurrences.add(count)) {
                return false; 
            }
        }
        return true;
    }    
}
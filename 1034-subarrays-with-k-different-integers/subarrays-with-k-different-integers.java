class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int upper = 0;
        for (int i = 0, j = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.size() > k) {
                map.remove(nums[upper]);   
                upper++;			
                j = upper;
            }
            if (map.size() == k) {		
                while (upper <= i && map.get(nums[upper]) > 1) { 
                    map.put(nums[upper], map.get(nums[upper]) - 1);
                    upper++;											
                }
                res += upper - j + 1;		
            }
        }
        return res;
    }
}
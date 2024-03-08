class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val:nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int maxfreq=0;
        for(int i:map.values()){
            maxfreq=Math.max(i,maxfreq);
        }
        int res=0;
        for(int count:map.values()){
            if(count==maxfreq){
                res+=count;
            }
        }
        return res;
    }
}
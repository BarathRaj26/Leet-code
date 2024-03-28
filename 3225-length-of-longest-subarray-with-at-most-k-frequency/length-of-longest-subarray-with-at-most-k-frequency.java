class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int left=0,right=0,max_length=0;

        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            max_length=Math.max(max_length,right-left+1);
            right++;
        } 
        return max_length;
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        int goal=0;
        for(int i=0;i<=goal;i++){
            goal=Math.max(goal,i+nums[i]);
            if(goal>=nums.length-1) return true;
        }
        return false;
    }
}
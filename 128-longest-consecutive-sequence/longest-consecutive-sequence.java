class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        if(nums.length==0){
            return 0;
        }

        for(int num:nums){
            set.add(num);
        }

        int count=1;
        int longest=0;

        for(int num:nums){
            if(!set.contains(num-1)){
                int n=num;
                count=1;

                while(set.contains(n+1)){
                    count++;
                    n=n+1;
                }
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}
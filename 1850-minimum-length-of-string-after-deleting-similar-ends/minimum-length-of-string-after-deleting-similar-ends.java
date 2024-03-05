class Solution {
    public int minimumLength(String s) {
        int left=0,right=s.length()-1;

        while(left<right && s.charAt(left)==s.charAt(right)){
            char compare=s.charAt(left);
            while(left<=right && s.charAt(left)==compare){
                left++;
            }
            while(right>=left && s.charAt(right)==compare){
                right--;
            }
        }
        return right-left+1;
    }
}
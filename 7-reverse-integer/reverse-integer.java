class Solution {
    public int reverse(int x) {

        int rev=0;
        while(x!=0){
            int d=x%10;
            int newResult = rev * 10 + d;
         if ((newResult - d) / 10 != rev) {
                return 0;
            }
            rev=newResult;
            x=x/10;
        }
        return rev;
    }
}
  
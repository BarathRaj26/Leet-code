class Solution {
    public boolean isPalindrome(int x) {
        long rev=0;
        long temp=x;
        while(temp!=0 && x>0){
            int digit =(int) (temp%10);
            rev=rev*10+digit;
            temp/=10;
        }
        if(rev==x) return true;
        else return false;
    }
}
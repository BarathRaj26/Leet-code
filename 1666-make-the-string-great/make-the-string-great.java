class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;

        while(i+1<=sb.length()){
            if(i>0 && sb.charAt(i-1)!=sb.charAt(i) && Character.toLowerCase(sb.charAt(i-1))==Character.toLowerCase(sb.charAt(i))){
                sb.delete(i-1,i+1);
                i=i-2;
            }
            i++;
        }
        return sb.toString();
    }
}
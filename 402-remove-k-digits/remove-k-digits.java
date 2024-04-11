class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        if(k>=n){
            return "0";
        }

        StringBuilder res=new StringBuilder();

        for(int i=0;i<n;i++){
            char digit=num.charAt(i);
            while(k>0&&res.length()>0&&res.charAt(res.length()-1)>digit){
                res.deleteCharAt(res.length()-1);
                k--;
            }
            res.append(digit);
        }
        res.delete(res.length()-k,res.length());

        int nonZeroIndex=0;
        while(nonZeroIndex<res.length()&&res.charAt(nonZeroIndex)=='0'){
            nonZeroIndex++;
        }
        return(nonZeroIndex==res.length()) ? "0":res.substring(nonZeroIndex);
    }
}
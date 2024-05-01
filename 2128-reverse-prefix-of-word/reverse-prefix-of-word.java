class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch)+1;
        StringBuffer rev=new StringBuffer(word.substring(0,index));
        return rev.reverse()+word.substring(index);
    }
}
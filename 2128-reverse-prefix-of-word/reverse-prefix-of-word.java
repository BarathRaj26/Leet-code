class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch)+1;
        StringBuilder rev=new StringBuilder(word.substring(0,index));
        return rev.reverse().toString()+word.substring(index);
    }
}


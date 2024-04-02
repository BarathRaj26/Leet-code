class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] map1=new int[256];
        int[] map2=new int[256];

        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(map1[schar]!=map2[tchar]){
                return false;
            }
            map1[schar]=i+1;
            map2[tchar]=i+1;
        }
        return true;
    }
}
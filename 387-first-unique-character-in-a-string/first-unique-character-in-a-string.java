class Solution {
    public int firstUniqChar(String s) {
        int len=s.length();
        if(len==0){
            return -1;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}
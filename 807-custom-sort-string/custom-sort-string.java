class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        StringBuilder result=new StringBuilder();
        for(char c: order.toCharArray()){
            if(map.containsKey(c)){
                result.append(String.valueOf(c).repeat(Math.max(0,map.get(c))));
                map.remove(c);
            }
        }

        for(char c:map.keySet()){
            result.append(String.valueOf(c).repeat(Math.max(0,map.get(c))));
        }
        return result.toString();
    }
}
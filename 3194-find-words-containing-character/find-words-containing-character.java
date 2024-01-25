class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        for(String s:words){
            if(s.indexOf(x)>=0){
                list.add(count);
            }
            count++;
        }
        return list;
    }
}
/*
["leet","code"]
count=0 leet contains e so 0 is added to the list
count++ count=1 
code contains e so 1 is also added into the list
return list[0,1]
*/
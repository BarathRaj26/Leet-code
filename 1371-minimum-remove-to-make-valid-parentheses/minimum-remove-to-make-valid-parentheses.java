class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        StringBuilder sb=new StringBuilder(s);
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else if(s.charAt(i)==')'){
                if(stack.size()>0 && s.charAt(stack.peek())=='('){
                    stack.pop();
                }
                else{
                    stack.push(i);
                }
            }
        } 

        while(stack.size()>0){
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString();
    }    
}

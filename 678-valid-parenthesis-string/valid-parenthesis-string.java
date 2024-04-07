class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> brack=new Stack<>();
        Stack<Integer> star =new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                brack.push(i);
            }
            else if(s.charAt(i)=='*'){
                star.push(i);
            }
            else{
                if(!brack.isEmpty()){
                    brack.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else{
                    return false;
                }
            }
        }

        while(!brack.isEmpty()){
            if(star.isEmpty()){
                return false;
            }
            else if(star.peek()>brack.peek()){
                star.pop();
                brack.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}
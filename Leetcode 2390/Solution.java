import java.util.Stack;

public class Solution{
    public static String removeStars(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder r = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '*'){
                if(!stack.empty()){
                    stack.pop();
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        while(!stack.empty()){
            r.append(stack.pop());
        }
        return r.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
        
    }
}
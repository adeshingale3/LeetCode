import java.util.Stack;

public class Solution{
    public static boolean isInt(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public static int claPoints(String[] operations){
        int sum = 0;
        Stack<Integer> output = new Stack<>();
        for(String s : operations){
            if(isInt(s)){
                output.push(Integer.parseInt(s));
            }else{
                if(s.equals("C")){
                    output.pop();
                }else if(s.equals("D")){
                    int y = output.peek()*2;
                    output.push(y);
                }else if(s.equals("+")){
                    int last = output.pop();
                    int secondLast = output.peek();
                    int z = last + secondLast;

                    output.push(last);
                    output.push(z);
                }
            }
        }
        while(!output.isEmpty()){
            sum += output.pop();
        }
        return sum;
    }
    public static void main(String[] args) {
        String[] s = {"5","-2","4","C","D","9","+","+"};
        System.out.println(claPoints(s));
    }
}
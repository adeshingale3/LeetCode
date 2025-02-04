import java.util.Stack;
import java.util.Arrays;


public class Solution {
    public static int[] asteroidCollision(int[] asteroids){
        Stack<Integer> stack = new Stack<>();

        for(int ast : asteroids){
            boolean addAst = true;
            while(!stack.empty() && stack.peek() > 0 && ast < 0){
                int last = stack.peek();
                if(last > Math.abs(ast)){
                    addAst = false;
                    break;
                }
                else if(last == Math.abs(ast)){
                    stack.pop();
                    addAst = false;
                    break;
                }
                else{
                    stack.pop();
                }
            }
            if(addAst){
                stack.push(ast);
            }
        }

        int[] result = new int[stack.size()];
        for(int i = stack.size() - 1 ; i >= 0 ; i--){
            result[i] = stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] asteroids = {8, -8};
        int[] result = asteroidCollision(asteroids);
        System.out.println(Arrays.toString(result));;
    }
    
}

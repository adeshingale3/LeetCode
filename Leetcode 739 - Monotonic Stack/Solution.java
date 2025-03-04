import java.util.Arrays;
import java.util.Stack;

public class Solution{
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];

        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < temperatures.length ; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int preIndex = st.pop();
                answer[preIndex] = i-preIndex;
            }
            st.push(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
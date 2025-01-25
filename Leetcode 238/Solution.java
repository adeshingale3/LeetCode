import java.util.Arrays;

public class Solution{
    public static int[] productExceptSelf(int[] nums){
        int[] answer = new int[nums.length];
        answer[0] = 1;

        // Prefix
        for(int i = 1 ; i < nums.length ; i++){
            answer[i] = answer[i-1]*nums[i-1];
        }

        // Suffix
        int suffix = 1;
        for(int i = nums.length-2 ; i >= 0 ; i--){
            suffix *= nums[i+1];
            answer[i] *= suffix;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        
    }
}
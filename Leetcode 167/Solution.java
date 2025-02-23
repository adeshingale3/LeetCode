import java.util.Arrays;

public class Solution{
    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if(numbers[left]+numbers[right] == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }else{
                if(numbers[left]+numbers[right] < target){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] result = {-1,0};
        System.out.println(Arrays.toString(twoSum(result, -1)));
        
    }
}
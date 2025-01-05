import java.util.Arrays;

public class Solution {
    public static int missingNumber(int[] nums){
        Arrays.sort(nums);
        int j = 1;
        if(nums.length >= 1){
            if(nums[0] != 0){
                return 0;
            }
        }
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[j] != nums[i]+1){
                return nums[j]-1;
            }
            j++;
        }
        return nums[nums.length-1]+1;

    }
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }    
}

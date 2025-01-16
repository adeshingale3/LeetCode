

public class Solution {
    public static int[] moveZeros(int[] nums){
        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0 ){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(moveZeros(nums)[i]);
        }
        
    }
    
}

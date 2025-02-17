import java.util.Arrays;

public class Solution{
    public static int maxOperations(int[] nums, int k){
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int opsCount = 0;

        while(i < j){
            if(nums[i]+nums[j] < k){
                i++;
            }else if(nums[i]+nums[j] > k){
                j--;
            }else{
                i++;
                j--;
                opsCount++;
            }
        }
        return opsCount;

    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }
}
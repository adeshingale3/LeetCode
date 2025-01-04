public class Solution {
    public static int searchInsert(int[] nums , int target){
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                return i;
            }else if(nums[i] > target){
                return i;
            }else if(target == nums[nums.length - 1]){
                return nums.length;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 3;
        System.out.println(searchInsert(nums, target));
    }
}

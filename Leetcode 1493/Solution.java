public class Solution{
    public static int longestSubArray(int[] nums){
        int max_length = 0;
        int zero = -1;
        int start = 0;
        for(int end = 0 ; end < nums.length ; end++){
            if(nums[end] == 0){
                start = zero+1;
                zero = end;
            }
            max_length = Math.max(max_length, end-start);
        }
        return max_length;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(longestSubArray(nums));
    }
}
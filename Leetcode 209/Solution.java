public class Solution{
    public static int minSubArrayLen(int target, int[] nums){
        int minWindow = Integer.MAX_VALUE;
        int i = 0 ;
        int j = 0 ;
        int currSum = 0;
        while(j < nums.length){
            currSum += nums[j];
            j++;

            while(currSum >= target){
                int currWindow = j-i;
                minWindow = Math.min(minWindow, currWindow);

                currSum -= nums[i];
                i++;
            }

        }
        return minWindow == Integer.MAX_VALUE ? 0 : minWindow;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3, 7};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
        
    }
}
public class Solution{
    public static int longestOnes(int[] nums, int k){
        int zeroCount = 0;
        int maxOnes = 0;
        int start = 0;
        for(int end = 0 ; end < nums.length ; end++){
            if(nums[end] == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(nums[start] == 0){
                    zeroCount--;
                }

                start++;
            }

            maxOnes = Math.max(maxOnes, end-start+1);
        }
        return maxOnes;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
        
    }
}
public class Solution{
    public static int pivotIndex(int[] nums){
        int preSum = 0;
        int postSum = 0;
        if(nums.length == 1){
            return 0;
        }
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                postSum += nums[j];
            }
            if(i == 0){
                preSum = 0;
            }else{
                preSum += nums[i-1];
            }

            if(preSum == postSum){
                return i;
            }
            postSum = 0;
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
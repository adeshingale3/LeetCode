public class Solution{
    public static boolean increasingTriplate(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int x : nums){
            if(x < first){
                first = x;    
            }else if(first < x && x < second){
                second = x;
            }else if(second < x){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 0, 4, 6};
        System.out.println(increasingTriplate(nums));
    }
}
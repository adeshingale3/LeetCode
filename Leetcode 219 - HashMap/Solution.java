import java.util.HashMap;

public class Solution{
    public static boolean containsNearbyDuplicates(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i]) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicates(nums, k));
    }
}
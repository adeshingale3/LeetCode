import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution{
    public static int[] intersection(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int num : nums1){
            temp.put(num, temp.getOrDefault(num, 0)+1);
        }

        List<Integer> result = new ArrayList<>();

        for(int num : nums2){
            if(temp.containsKey(num) && temp.get(num) > 0){
                result.add(num);
                temp.put(num, temp.get(num)-1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
 
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
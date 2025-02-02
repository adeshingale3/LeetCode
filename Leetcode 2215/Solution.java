import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public static List<Integer> commonArray(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int n : nums2){
            set2.add(n);
        }

        for(int n : nums1){
            if(!set2.contains(n)){
                set1.add(n);
            }
        }
        return new ArrayList<>(set1);
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        return Arrays.asList(commonArray(nums1, nums2), commonArray(nums2, nums1));
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        System.out.println(findDifference(nums1, nums2));
        
    }    
}

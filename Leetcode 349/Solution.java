import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution{
    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> temp = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < nums1.length ; i++){
            temp.add(nums1[i]);
        }

        for(int i = 0 ; i < nums2.length ; i++){
            if(temp.contains(nums2[i])){
                result.add(nums2[i]);
                temp.remove(nums2[i]);
            }
        }
        int[] finalArray = new int[result.size()];
        for(int i = 0 ; i < result.size() ; i++){
            finalArray[i] = result.get(i);
        }
        return finalArray;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2,1};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        
    }
}
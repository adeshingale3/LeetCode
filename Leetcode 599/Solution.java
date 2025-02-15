import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution{
    public static String[] findRestaurant(String[] list1, String[] list2){
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < list1.length ; i++){
            map.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();
        for(int i = 0 ; i < list2.length ; i++){
            if(map.containsKey(list2[i])){
                int indexSum = i + map.get(list2[i]);
                if(indexSum < minSum){
                    res.clear();
                    res.add(list2[i]);
                    minSum = indexSum;
                }else if(indexSum == minSum){
                    res.add(list2[i]);
                }
            }
        }
        String[] output = res.toArray(new String[0]);
        return output;
    }
    public static void main(String[] args) {
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
        
    }
}
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] candies = {1, 4, 6, 2, 3, 8};
        int extraCandies = 2;
        System.out.println(kidsWithCandies(candies, extraCandies));
        
    }
    
}

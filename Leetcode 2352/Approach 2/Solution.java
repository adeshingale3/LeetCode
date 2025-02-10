import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static int equlaPairs(int[][] grid){
        int pairCount = 0;
        HashMap<List<Integer>, Integer> map = new HashMap<>();

        // Add rows in HashMap
        for(int r = 0 ; r < grid.length ; r++){
            List<Integer> rowList = new ArrayList<>();
            for(int num : grid[r]){
                rowList.add(num);
            }
            map.put(rowList, map.getOrDefault(rowList, 0) + 1);
        }

        // Now compare column with rows in map
        for(int c = 0 ; c < grid.length ; c++){
            List<Integer> temp = new ArrayList<>();
            for(int r = 0 ; r < grid.length ; r++){
                temp.add(grid[r][c]);
            }
            if(map.containsKey(temp)){
                pairCount += map.get(temp);
            }
        }
        return pairCount;

    }
    public static void main(String[] args) {
        int[][] grid = {{3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}};
        System.out.println(equlaPairs(grid));
    }

    
}

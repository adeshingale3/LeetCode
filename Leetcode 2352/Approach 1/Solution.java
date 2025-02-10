public class Solution{
    public static int equlaPairs(int[][] grid){
        int pairCount = 0;

        for(int r = 0 ; r < grid.length ; r++){
            for(int c = 0 ; c < grid.length ; c++){
                boolean isEqual = true;
                for(int i = 0 ; i < grid.length ; i++){
                    if(grid[r][i] != grid[i][c]){
                        isEqual = false;
                        break;
                    }
                }
                if(isEqual){
                    pairCount++;
                }
            }
        }
        return pairCount; 
    }
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equlaPairs(grid));
    }
}
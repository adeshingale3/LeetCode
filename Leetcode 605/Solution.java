public class Solution{
    public static boolean canPlaceFlower(int n, int[] flowerbed){
        boolean left = false;
        boolean right = false;
        for(int i = 0 ; i < flowerbed.length ; i++){
            left = i == 0 || flowerbed[i-1] == 0;
            right = i == flowerbed.length - 1 || flowerbed[i+1] == 0;

            if(left && right && flowerbed[i] == 0){
                flowerbed[i] = 1;
                n = n-1;
            }
        }
        return n <= 0;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] flowerbed = {1, 0, 0, 0, 1, 0, 0};
        System.out.println(canPlaceFlower(n, flowerbed));
    }
}
// import java.lang.Math;

public class Solution{
    public static int maxArea(int[] height){
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int currArea = Math.min(height[left], height[right])*(right-left);
            if(currArea > maxArea){
                maxArea = currArea;
            }

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        
    }
}
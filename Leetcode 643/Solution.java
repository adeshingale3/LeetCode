
public class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        // Find the sum of first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;

        // Slide the window
        int startIndex = 0;
        int endIndex = k;

        while (endIndex < nums.length) {
            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum/k;

    }

    public static void main(String[] args) {
        int[] nums = {1, 4, -5, 6, 9, 8};

        System.out.println(findMaxAverage(nums, 4));

    }

}

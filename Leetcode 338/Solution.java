import java.util.Arrays;

public class Solution{
    public static int[] countBits(int n){
        int[] result = new int[n+1];
        for(int i = 0 ; i < result.length ; i++){
            result[i] = result[i>>1] + (i&1);
        }
        return result;    
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(countBits(n)));
    }
}
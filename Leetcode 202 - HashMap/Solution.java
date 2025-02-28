import java.util.HashSet;

public class Solution{
    public static boolean isHappy(int n){
        HashSet<Integer> used = new HashSet<>();
        while(true){
            int sum = 0;
            while(n != 0){
                sum += Math.pow(n%10, 2.0);
                n = n/10;
            }
            if(sum == 1){
                return true;
            }else{
                n = sum;
            }

            if(used.contains(n)){
                return false;
            }else{
                used.add(n);
            }
        }
    }
    public static void main(String[] args) {
        int n = 61;
        System.out.println(isHappy(n));
    }
}
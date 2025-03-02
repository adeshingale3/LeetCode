public class Solution{
    public static int hummingWight(int n){
        int count = 0;
        while(n != 0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hummingWight(128));
    }
}
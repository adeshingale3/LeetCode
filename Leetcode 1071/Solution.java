public class Solution{
    public static int gcd(int l1, int l2){
        if(l2 == 0){
            return l1;
        }
        return  gcd(l2, l1%l2);

    }
    public static String gcdOfString(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0, gcd(l1, l2));
    }
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(gcdOfString(str1, str2));
        
    }
}
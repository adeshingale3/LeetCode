public class Solution{
    public static boolean isSubsequence(String s, String t){
        int sIndex = 0;
        int tIndex = 0;
        while(sIndex < s.length() && tIndex < t.length()){
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }else{
                tIndex++;
            }
        }
        return sIndex == s.length();
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "acdbgh";

        System.out.println(isSubsequence(s, t));
        
    }
}
public class Solution{
    public static boolean isPalndrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalndrome(s));
        
    }
}
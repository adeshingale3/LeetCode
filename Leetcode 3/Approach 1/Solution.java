import java.util.HashSet;

public class Solution{
    public static int lengthOfLongestSubString(String s){
        HashSet<Character> letter = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0 ; right < s.length() ; right++){
            while(letter.contains(s.charAt(right))){
                letter.remove(s.charAt(left));
                left++;        
            }
            letter.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubString(s));
    }
}
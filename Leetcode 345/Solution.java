import java.util.HashSet;
import java.util.Set;

public class Solution{
    public static String reverseVowel(String s){
        int left = 0 ;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        HashSet<Character> vowel = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        while(left < right){
            if(vowel.contains(chars[left]) && vowel.contains(chars[right])){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }else if(vowel.contains(chars[left]) && !vowel.contains(chars[right])){
                right--;
            }else if(!vowel.contains(chars[left]) && vowel.contains(chars[right])){
                left++;
            }else if(!vowel.contains(chars[left]) && !vowel.contains(chars[right])){
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }
            public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowel(s));
        
    }
}
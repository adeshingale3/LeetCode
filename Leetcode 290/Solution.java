import java.util.HashMap;

public class Solution{
    public static boolean wordPattern(String pattern, String s){
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        HashMap<Character, String> mapping = new HashMap<>();
        for(int i = 0 ; i < pattern.length() ; i++){
            char original = pattern.charAt(i);
            String replacement = words[i];

            if(!mapping.containsKey(original)){
                if(!mapping.containsValue(replacement)){
                    mapping.put(original, replacement);
                }else{
                    return false;
                }
            }else{
                String mappedChar = mapping.get(original);
                if(!mappedChar.equals(replacement)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abbc";
        String s = "dog cat cat frog";
        System.out.println(wordPattern(pattern, s));
    }
}
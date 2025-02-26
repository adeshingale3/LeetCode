import java.util.HashMap;

public class Solution{
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> mapping = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char original = s.charAt(i);
            if(mapping.containsKey(original)){
                mapping.put(original, mapping.get(original)+1);
            }else{
                mapping.put(original, mapping.getOrDefault(mapping, 0)+1);
            }
        }

        for(int i = 0 ; i < t.length() ; i++){
            char original = t.charAt(i);
            if(mapping.containsKey(original)){
                if(mapping.get(original) > 0){
                    mapping.put(original, mapping.get(original)-1);
                }
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaramp";
        System.out.println(isAnagram(s, t));
        
    }
}
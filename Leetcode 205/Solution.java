import java.util.HashMap;

public class Solution{
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> mapping = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!mapping.containsKey(original)){
                if(!mapping.containsValue(replacement)){
                    mapping.put(original, replacement);
                }else{
                    return false;
                }
            }else{
                char mappedChar = mapping.get(original);
                if(mappedChar != replacement){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "foo";
        String t = "aff";

        System.out.println(isIsomorphic(s, t));
    }
}
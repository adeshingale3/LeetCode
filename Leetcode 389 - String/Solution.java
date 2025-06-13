import java.util.HashMap;

 public class Solution{
    public static char findTheDifference(String s, String t){
        HashMap<Character, Integer> Storage = new HashMap<>();
        for(char c : s.toCharArray()){
            Storage.put(c, Storage.getOrDefault(c, 0)+1);
        }

        for(char c : t.toCharArray()){
            if(Storage.containsKey(c)){
                Storage.put(c, Storage.get(c)-1);
                if(Storage.get(c) < 0){
                    return c;
                }
            }else{
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }
    
}
import java.util.HashMap;

public class Solution{
    public static boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character, Integer> storage = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            storage.put(c, storage.getOrDefault(c, 0)+1);
        }

        for(char c : magazine.toCharArray()){
            if(storage.containsKey(c)){
                storage.put(c, storage.get(c)-1);
                if(storage.get(c) == 0){
                    storage.remove(c);
                }
            }
            if(storage.isEmpty()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
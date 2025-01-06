import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findWordsContaining(String[] words, char x){
        List<Integer> output = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    output.add(i);
                    break;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String[] words = {"Leet", "Code", "Adesh"};
        System.out.println(findWordsContaining(words, 'e'));
    }

    
}

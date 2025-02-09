import java.util.Arrays;

public class Solution{
    public static boolean closeString(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        boolean[] present1 = new boolean[26];
        boolean[] present2 = new boolean[26];

        for(char x : word1.toCharArray()){
            freq1[x - 'a']++;
            present1[x - 'a'] = true;
        }
        for(char x : word2.toCharArray()){
            freq2[x - 'a']++;
            present2[x - 'a'] = true;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2) && Arrays.equals(present1, present2);
    }
    public static void main(String[] args) {
        String word1 = "abz";
        String word2 = "bca";
        
        System.out.println(closeString(word1, word2));
    }
}
public class Solution{
    public static String mergeAlternately(String word1, String word2){
        int i = 0;
        int j = 0;
        String res = "";
        while( i < word1.length() && j < word2.length()){
            res += word1.charAt(i);
            res += word2.charAt(j);
            i++;
            j++;
        }
        if(i == word1.length()){
            for(int k = j ; k < word2.length() ; k++){
                res += word2.charAt(k);
            }
        }
        else{
            for(int k = i ; k < word2.length() ; k++){
                res += word1.charAt(k);
            }
        }
        return res;

    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrstu";

        System.out.println(mergeAlternately(word1, word2));
        
    }
}
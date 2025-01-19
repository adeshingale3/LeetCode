public class Solution {
    public static String reverseWords(String s){
        String[] words = s.split("\\s+");
        String output = "";
        for(int i = words.length - 1; i >= 0 ; i--){
            output += words[i] + " ";
        }
        return output.trim();
    }
    public static void main(String[] args) {
        String s = "You all are bullshit guys";
        System.out.println(reverseWords(s));
        
    }
    
}

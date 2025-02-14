public class Solution{
    public static int maxVowels(String s, int k){
        int maxVowel = 0;
        int max = 0;
        int start = 0;
        for(int end = 0 ; end < s.length() ; end++){
            if(s.charAt(end) == 'a' || s.charAt(end) == 'e' || s.charAt(end) == 'i' 
            || s.charAt(end) == 'o' || s.charAt(end) == 'u' ){
                max++;
            }

            while((end-start+1) > k){
                if(s.charAt(start) == 'a' || s.charAt(start) == 'e' || s.charAt(start) == 'i' || 
                s.charAt(start) == 'o' || s.charAt(start) == 'u'){
                    max--;
                }

                start++;
            }
            maxVowel = Math.max(maxVowel, max);
        }
        return maxVowel;
    }
    public static void main(String[] args) {
        String s = "aeiou";
        int k = 2;
        System.out.println(maxVowels(s, k));
    }
}
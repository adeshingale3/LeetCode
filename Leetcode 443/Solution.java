class Solution {
    public static int compress(char[] chars) {
        int idx = 0;
        int count = 0;
        int i = 0;
        while(i < chars.length){
            char ch = chars[i];
            while(i < chars.length && chars[i] == ch){
                count++;
                i++;
            }

            chars[idx] = ch;
            idx++;
            if(count > 1){
                for(char digit : String.valueOf(count).toCharArray()){
                    chars[idx] = digit;
                    idx++;
                }
            }
        }
        return idx;

    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars));
    }
}
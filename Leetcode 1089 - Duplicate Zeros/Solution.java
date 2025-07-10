class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(j < arr.length){
                temp[j] = arr[i];
                if(arr[i] == 0 && j < arr.length-1){
                    j++;
                    temp[j] = 0;
                    j++;
                }else{
                    j++;
                }
            }

        }

        for(int i = 0 ; i < temp.length ; i++){
            arr[i] = temp[i];
        }
        
    }
}
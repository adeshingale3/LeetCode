public class Solution{
    public static int largestAltitude(int[] gains){
        int altitude = 0;
        int maxAltitude = 0;
        for(int i = 0 ; i < gains.length ; i++){
            altitude += gains[i];
            if(altitude >= maxAltitude){
                maxAltitude = altitude;
            }
        }
        return maxAltitude;
    }
    public static void main(String[] args) {
        int[] gains = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gains));
        
    }
}
package leetCode.prefixsum;

import leetCode.arraystring._1768;

public class _1732 {
    public static void main(String[] args) {
        int output = new _1732().largestAltitude(new int[]{-4,-3,-2,-1,4,3,2});
        System.out.println(output);
    }

    public int largestAltitude(int[] gain) {
        int largestAltitude = 0;
        int currentAltitude = 0;

        for(int i = 0; i < gain.length; i++){
            currentAltitude += gain[i];
            if(currentAltitude > largestAltitude){
                largestAltitude = currentAltitude;
            }
        }
        return largestAltitude;
    }
}

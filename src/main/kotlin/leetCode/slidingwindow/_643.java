package leetCode.slidingwindow;

public class _643 {
    public static void main(String[] args) {
        double output = new _643().findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4);
        System.out.println(output);
    }

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0; i<k; i++) {
            sum += nums[i];
        }
        double maxAverage = sum / k;

        for(int i=k; i<nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];

            double average = sum / k;
            if(average > maxAverage) {
                maxAverage = average;
            }
        }
        return maxAverage;
    }
}

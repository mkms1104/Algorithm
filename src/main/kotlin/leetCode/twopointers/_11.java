package leetCode.twopointers;

public class _11 {
    public static void main(String[] args) {
        int output = new _11().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(output);
    }

    public int maxArea(int[] height) {
        int maximumAmount = 0;
        int l = 0;
        int r = height.length-1;

        while(l < r) {
            int min = Math.min(height[l], height[r]);
            int x = r-l;
            if(min * x > maximumAmount) {
                maximumAmount = min * x;
            };

            if(height[l] < height[r]) l++;
            else r--;
        }

        return maximumAmount;
    }
}

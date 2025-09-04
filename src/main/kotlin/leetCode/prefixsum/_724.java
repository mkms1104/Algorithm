package leetCode.prefixsum;

public class _724 {
    public static void main(String[] args) {
        int output = new _724().pivotIndex(new int[]{1,7,3,6,5,6});
        System.out.println(output);
    }

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for(int i=1; i<nums.length; i++) {
            rightSum += nums[i];
        }

        if(leftSum == rightSum) return 0;

        for(int pi=1; pi<nums.length; pi++) {
            leftSum += nums[pi-1];
            rightSum -= nums[pi];
            if(leftSum == rightSum) return pi;
        }

        return -1;
    }
}

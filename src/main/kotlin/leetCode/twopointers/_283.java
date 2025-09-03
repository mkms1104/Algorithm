package leetCode.twopointers;

import java.util.Arrays;

public class _283 {
    public static void main(String[] args) {
        new _283().moveZeroes(new int[]{1,0,0,1});
    }

    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        // Step 1: 모든 0이 아닌 값들을 앞으로 복사
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        // Step 2: 나머지는 0으로 채움
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

package leetCode.slidingwindow;

public class _1004 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            // 오른쪽 포인터 값이 0이면 zeroCount 증가
            if (nums[right] == 0) zeroCount++;

            // 0이 k를 초과하면 left 포인터를 오른쪽으로 이동
            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            // 현재 window 길이 갱신
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

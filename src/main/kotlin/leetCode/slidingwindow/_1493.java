package leetCode.slidingwindow;

public class _1493 {
    public int longestSubarray(int[] nums) {
        int left = 0, zeroCount = 0, maxLen = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // 여기서 +1 안 함 (정확히 하나 삭제해야 하므로)
            maxLen = Math.max(maxLen, right - left);
        }

        return maxLen;
    }
}

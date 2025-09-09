package leetCode.twopointers;

import java.util.Arrays;

public class _1679 {
    public static void main(String[] args) {
        int output = new _1679().maxOperations(new int[] {3,1,3,4,3}, 6);
        System.out.println(output);
    }

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 0;
        int l=0;
        int r=nums.length-1;

        while(l<r) {
            int sum = nums[l] + nums[r];
            if(sum == k) {
                l++;
                r--;
                count++;
            }
            else if(sum < k) {
                l++;
            }
            else {
                r--;
            }
        }
        return count;
    }

    // 브루트포스
//    public int maxOperations(int[] nums, int k) {
//        int count = 0;
//        for(int i=0; i<nums.length; i++){
//            if(nums[i] == 0) continue;
//            for(int j=i+1; j<nums.length; j++){
//                if(nums[j] == 0) continue;
//                if(nums[i] + nums[j] == k) {
//                    count++;
//                    nums[i] = 0;
//                    nums[j] = 0;
//                    break;
//                }
//            }
//        }
//        return count;
//    }
}

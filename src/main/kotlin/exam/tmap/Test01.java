package exam.tmap;

import java.util.Arrays;

public class Test01 {
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;

        for (int i=0; i < 2; i++) {
            int idx = -1;
            int total = Arrays.stream(A).sum();
            for (int j=0; j<A.length; j++) {
                int target = total - A[j] + numberSum(A[j]);
                if (min > target) {
                    min = target;
                    idx = j;
                }
            }
            if (idx != -1) A[idx] = numberSum(A[idx]);
        }
        return min;
    }

    private int numberSum(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::valueOf).sum();
    }
}

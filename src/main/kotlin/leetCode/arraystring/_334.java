package leetCode.arraystring;

public class _334 {
    public static void main(String[] args) {
        boolean output = new _334().increasingTriplet(new int[] {20,100,10,12,5,13});
        System.out.println(output);
    }

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;          // 첫 번째 최소값 갱신
            } else if (n <= second) {
                second = n;         // 두 번째 최소값 갱신
            } else {
                return true;        // n > first && n > second → 세 번째 값 발견
            }
        }
        return false;
    }
}

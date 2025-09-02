package leetCode;

public class _605 {
    public static void main(String[] args) {
        boolean output = new _605().canPlaceFlowers(new int[]{0,1,0}, 1);
        System.out.println(output);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;

        int plantedCount = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                int left = (i == 0) ? 0 : flowerbed[i - 1]; // 경계 처리
                int right = (i == len - 1) ? 0 : flowerbed[i + 1]; // 경계 처리

                if (left == 0 && right == 0) {
                    flowerbed[i] = 1;
                    if (++plantedCount == n) return true;
                }
            }
        }

        return plantedCount >= n;
    }
}

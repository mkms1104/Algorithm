package leetCode;

public class _1071 {
    public static void main(String[] args) {
        String output = new _1071().gcdOfStrings("ABABAB", "ABAB");
        System.out.println(output);
    }

    public String gcdOfStrings(String str1, String str2) {
        // 1. 두 문자열의 합이 다르면 공통 패턴 없음
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // 2. 길이의 최대공약수 구하기
        int gcdLen = gcd(str1.length(), str2.length());

        // 3. 앞부분 잘라서 반환
        return str1.substring(0, gcdLen);
    }

    // 최대공약수 구하는 메서드 (유클리드 호재법)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}

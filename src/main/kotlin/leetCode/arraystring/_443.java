package leetCode.arraystring;

public class _443 {
    public static void main(String[] args) {
//        int output = new _443().compress(new char[] {'a','a','b','b','c','c','c'});
        int output = new _443().compress(new char[] {'a','b','b','b','b','b','b','b','b','b','b','b','b'});
        System.out.println(output);
    }

    public int compress(char[] chars) {
        int write = 0; // 압축된 문자를 써 넣을 위치
        int read = 0;  // 원본 배열 읽는 위치

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            // 같은 문자 그룹 세기
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // 문자 하나 기록
            chars[write++] = current;

            // 개수가 1보다 크면 숫자도 기록
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // 압축된 길이
    }
}

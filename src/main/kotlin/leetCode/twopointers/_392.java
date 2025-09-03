package leetCode.twopointers;

public class _392 {
    public static void main(String[] args) {
        boolean output = new _392().isSubsequence("axc", "ahbgdc");
        System.out.println(output);
    }

    public boolean isSubsequence(String s, String t) {
        int p = 0;
        for(char tChar : t.toCharArray()) {
            if (p >= s.length()) break;
            if (tChar == s.charAt(p)) p++;
        }
        return p == s.length();
    }
}

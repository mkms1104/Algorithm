package leetCode;

public class _1768 {
    public static void main(String[] args) {
        String output = new _1768().mergeAlternately("ab", "pqrs");
        System.out.println(output);
    }

    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        String output = "";

        while(i < word1.length()) {
            output+=word1.charAt(i++);
            output+=word2.charAt(j++);
        }

        while(j < word2.length()) {
            output+=word2.charAt(j++);
        }
        return output;
    }
}

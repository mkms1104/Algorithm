package leetCode.arraystring;

public class _151 {
    public static void main(String[] args) {
        String output = new _151().reverseWords("a good   example");
        System.out.println(output);
    }

    public String reverseWords(String s) {
        String[] s1 = s.trim().split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
            if(!s1[i].isBlank()) {
                sb.append(s1[i]);
                if(i > 0) sb.append(" ");
            }

        }
        return sb.toString();
    }
}

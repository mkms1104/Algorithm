package leetCode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _345 {
    public static void main(String[] args) {
        String output = new _345().reverseVowels("IceCreAm");
        System.out.println(output);
    }

    public String reverseVowels(String s) {
        Set<String> vowels = new HashSet<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        List<Integer> index = new ArrayList<>();
        StringBuilder reversed = new StringBuilder();

        char[] sCharArray = s.toCharArray();
        for(int i=0; i<sCharArray.length; i++){
            String charStr = String.valueOf(sCharArray[i]);
            if(vowels.contains(charStr.toLowerCase())) {
                index.add(i);
                reversed.append(charStr);
            }
        }

        reversed.reverse();

        for(int i=0; i<index.size(); i++){
            sCharArray[index.get(i)] = reversed.charAt(i);
        }

        return Stream.of(sCharArray).map(String::valueOf).collect(Collectors.joining());
    }
}

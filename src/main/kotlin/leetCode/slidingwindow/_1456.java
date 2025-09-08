package leetCode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class _1456 {
    public static void main(String[] args) {
        int output = new _1456().maxVowels("zpuerktejfp", 3);
        System.out.println(output);
    }

    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int currentNumber = 0;
        int maxNumber;

        char[] chars = s.toCharArray();
        for(int i=0; i<k; i++) {
            if(vowels.contains(chars[i])) currentNumber++;
            if(currentNumber == k) return k;
        }

        maxNumber = currentNumber;

        for(int i=k; i<s.length(); i++) {
            char first = chars[i - k];
            char last = chars[i];

            if(vowels.contains(first)) currentNumber--;
            if(vowels.contains(last)) currentNumber++;

            if(currentNumber == k) return k;
            maxNumber = Math.max(maxNumber, currentNumber);
        }

        return maxNumber;
    }
}

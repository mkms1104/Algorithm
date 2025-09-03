package leetCode.arraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1431 {
    public static void main(String[] args) {
        List<Boolean> output = new _1431().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        output.forEach(System.out::println);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            output.add((candy + extraCandies) >= max);
        }
        return output;
    }
}

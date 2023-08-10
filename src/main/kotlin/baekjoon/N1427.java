package baekjoon;

import java.util.Scanner;

public class N1427 {
    private static void solution(String numStr) {
        int[] arr = new int[10];
        for(char numChar : numStr.toCharArray()) {
            int num = Character.getNumericValue(numChar);
            arr[num] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--) {
            int j = arr[i];
            while(j > 0) {
                sb.append(i);
                j--;
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        solution(numStr);
    }
}

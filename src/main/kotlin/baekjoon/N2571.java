package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class N2571 {
    private static void solution(int[] arr) {
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i : arr) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }
}

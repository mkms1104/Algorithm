package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class N4779 {
    public static String solution(int n) {
        int cantorSize = (int) Math.pow(3, n);
        String[] arr = new String[cantorSize];
        Arrays.fill(arr, "-");

        recursiveCantor(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        return "";
    }

    private static void recursiveCantor(String[] arr, int start, int end) {
        int middleStart = (end - start + 1) / 3;
        int middleEnd = middleStart * 2 - 1;

        // middle cantor fill empty
        for(int i=middleStart; i<=middleEnd; i++) {
            arr[i] = null;
        }


        // first cantor divide
        if(end - start >= 1) {
            recursiveCantor(arr, 0, middleStart - 1);
        }

        // last cantor divide
        if(end - start >= 1) {
            System.out.println(start + " " +end);
            recursiveCantor(arr, middleEnd + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}

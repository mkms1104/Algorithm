package baekjoon;

import java.util.Scanner;

/**
 * @url https://www.acmicpc.net/problem/2587
 * @type 정렬
 */
public class N2587 {
    public static void solution(int[] arr) {
        int sum = arr[0];
        for(int i=1; i<arr.length; i++) {
            int j = i;
            sum += arr[i];

            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        int middle = arr[arr.length / 2];

        System.out.println(sum / arr.length);
        System.out.println(middle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }
}

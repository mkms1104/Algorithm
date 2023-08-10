package sort;

import java.util.Scanner;

public class SelectionSortJ {
    public static void solution(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int minIndex = i; // 현재 최소 값의 인덱스
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // i 회전에서 최소 값이 변경된 경우 (스왑 최소화)
            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }
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

package sort;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortJ {
    // 5 3 8 4 9 1 6 2 7
    private static void solution(int[] arr) {
        if(arr.length < 2) return;

        int i=1, j=arr.length-1;
        int pivot = arr[0];

        do {
            // 왼쪽부터 피벗보다 큰 데이터의 위치를 찾는다.
            while(i <= j && arr[i] < pivot) {
                i++;
            }

            // 오른쪽부터 피벗보다 작은 데이터의 위치를 찾는다.
            while(j >= i && arr[j] > pivot) {
                j--;
            }

            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }

        } while(i < j);

        int temp = arr[j];
        arr[j] = arr[0];
        arr[0] = temp;

        for(int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();

        solution(Arrays.copyOfRange(arr, 0, j));
        solution(Arrays.copyOfRange(arr, j+1, arr.length));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);

        System.out.println("=================================");
        for(int k : arr) {
            System.out.print(k + " ");
        }
    }
}

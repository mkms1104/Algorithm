package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeSortJ {
    private static int[] merge(int[] left, int[] right) {
        System.out.print("left : ");
        for(int i : left) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("right : ");
        for(int i : right) {
            System.out.print(i + " ");
        }

        System.out.println();

        int m = 0, i = 0, j = 0;
        int[] temp = new int[left.length * 2];
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                temp[m++] = left[i];
                i++;
            }
            else {
                temp[m++] = right[j];
                j++;
            }
        }

        while(i < left.length) {
            temp[m++] = left[i++];
        }

        while(j < right.length) {
            temp[m++] = right[j++];
        }

        System.out.print("merged : ");
        for(int k : temp) {
            System.out.print(k + " ");
        }

        System.out.println();
        System.out.println("=====================");

        // 6 5 3 1 8 7 2 4
        return temp;
    }

    private static int[] divide(int[] arr) {
        if(arr.length <= 1) return arr;

        int midPosition = arr.length / 2;
        int[] left = divide(Arrays.copyOfRange(arr, 0, midPosition));
        int[] right = divide(Arrays.copyOfRange(arr, midPosition, arr.length));
        return merge(left, right);
    }

    private static void solution(int[] arr) {
        int[] divide = divide(arr);
        for(int i : divide) {
            System.out.print(i + " ");
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

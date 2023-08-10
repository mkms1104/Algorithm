package baekjoon;

import java.util.Scanner;

public class N11650 {
    private static void swapPosition(int[][] arr, int index) {
        // x좌표 스왑
        int tempX = arr[index-1][0];
        arr[index-1][0] = arr[index][0];
        arr[index][0] = tempX;

        // y좌표 스왑
        int tempY = arr[index-1][1];
        arr[index-1][1] = arr[index][1];
        arr[index][1] = tempY;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][2];

        // 첫번째 요소는 정렬 상태라고 가정한다.
        arr[0][0] = sc.nextInt();
        arr[0][1] = sc.nextInt();

        // 삽입 정렬 수행
        for(int i=1; i<arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

            for(int j=i; j>0; j--) {
                if(arr[j-1][0] > arr[j][0]) {
                    swapPosition(arr, j);
                } else if (arr[j-1][0] == arr[j][0]) {
                    if(arr[j-1][1] > arr[j][1]) {
                        swapPosition(arr, j);
                    } else break;
                } else break;
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<2; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

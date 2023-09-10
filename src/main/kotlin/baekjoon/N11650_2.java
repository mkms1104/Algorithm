package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class N11650_2 {
    private static String solution(int[][] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            int compared = o1[0] - o2[0];
            if(compared == 0) {
                return o1[1] - o2[1];
            }
            return compared;
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<2; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];

        for(int i=0; i<num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }
}

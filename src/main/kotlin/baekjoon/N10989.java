package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @url https://www.acmicpc.net/problem/10989
 * @type 정렬
 */
public class N10989 {
    public static void main(String[] args) throws IOException {
        // Scanner 대신 BufferedReader 사용해야 한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 빌더에 한번에 담아서 출력해야 한다.
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[10000 + 1];
        for(int i=0; i<num; i++) {
            int index = Integer.parseInt(br.readLine());
            arr[index] += 1;
        }

        for(int i=1; i<arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                sb.append(i).append("\n");

            }
        }

        System.out.println(sb);
    }
}

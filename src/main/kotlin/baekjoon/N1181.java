package baekjoon;

import java.util.*;

public class N1181 {
    private static void solution(String[] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            int compared = Integer.compare(o1.length(), o2.length());
            if(compared == 0) {
                return o1.compareTo(o2);
            }
            return compared;
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> s = new HashSet<>();

        for(int i=0; i<n; i++) {
            s.add(sc.next());
        }
        
        solution(s.toArray(String[]::new));
    }
}

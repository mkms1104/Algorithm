package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class N10814 {
    private static class Member {
        private final int seq;
        private final int age;
        private final String name;

        public Member(int seq, int age, String name) {
            this.seq = seq;
            this.age = age;
            this.name = name;
        }

        public int getSeq() {
            return seq;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    private static void solution(Member[] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            int compared = Integer.compare(o1.getAge(), o2.getAge());
            if(compared == 0) {
                return Integer.compare(o1.getSeq(), o2.getSeq());
            }
            return compared;
        });

        StringBuilder sb = new StringBuilder();
        for(Member m : arr) {
            sb.append(m.getAge()).append(" ").append(m.getName());
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Member[] arr = new Member[n];
        for(int i=0; i<n; i++) {
            arr[i] = new Member(i, sc.nextInt(), sc.next());
        }
        solution(arr);
    }
}

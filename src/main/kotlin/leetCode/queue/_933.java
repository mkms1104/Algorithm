package leetCode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class _933 {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();

        int[] ping = new int[] {1, 100, 3001, 3002};

        for(int i=0; i<4; i++) {
            int count = recentCounter.ping(ping[i]);
            System.out.println(count);
        }
    }


    static class RecentCounter {
        private final Queue<Integer> ping = new LinkedList<>();

        public RecentCounter() {

        }

        public int ping(int t) {
            ping.offer(t);

            while(!ping.isEmpty()) {
                if(ping.peek() < t-3000) {
                    ping.poll();
                }
                else break;
            }
            return ping.size();
        }
    }
}

package leetCode.priorityqueue;

import java.util.PriorityQueue;

public class _2462 {
    public static void main(String[] args) {
        long output = new _2462().totalCost(new int[]{17,12,10,2,7,2,11,20,8}, 3, 4);
        System.out.println(output);
    }

    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Worker> firstWorkers = new PriorityQueue<>();
        PriorityQueue<Worker> secondWorkers = new PriorityQueue<>();

        int n = costs.length;
        int fwc = 0;          // front pointer
        int swc = n - 1;      // back pointer

        // 초기 세팅: 앞쪽 candidates명
        while (fwc < candidates && fwc <= swc) {
            firstWorkers.offer(new Worker(fwc, costs[fwc]));
            fwc++;
        }
        // 뒤쪽 candidates명
        while (swc >= n - candidates && swc >= fwc) {
            secondWorkers.offer(new Worker(swc, costs[swc]));
            swc--;
        }

        long sum = 0;
        for (int i = 0; i < k; i++) {
            Worker fWorker = firstWorkers.peek();
            Worker sWorker = secondWorkers.peek();

            // 둘 중에서 더 싼 사람 선택
            if (sWorker == null || (fWorker != null && fWorker.getCost() <= sWorker.getCost())) {
                Worker target = firstWorkers.poll();
                sum += target.getCost();

                // 다음 front 후보 채우기
                if (fwc <= swc) {
                    firstWorkers.offer(new Worker(fwc, costs[fwc]));
                    fwc++;
                }
            } else {
                Worker target = secondWorkers.poll();
                sum += target.getCost();

                // 다음 back 후보 채우기
                if (fwc <= swc) {
                    secondWorkers.offer(new Worker(swc, costs[swc]));
                    swc--;
                }
            }
        }
        return sum;
    }

    static class Worker implements Comparable<Worker> {
        private final int pos;
        private final int cost;

        public Worker(int pos, int cost) {
            this.pos = pos;
            this.cost = cost;
        }

        public int getPos() {
            return pos;
        }

        public int getCost() {
            return cost;
        }

        @Override
        public int compareTo(Worker o) {
            return this.cost - o.cost;
        }
    }
}

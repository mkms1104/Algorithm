package leetCode.priorityqueue;

import java.util.PriorityQueue;

public class _215 {
    public static void main(String[] args) {
        int output = new _215().findKthLargest(new int[]{99,99}, 1);
        System.out.println(output);
    }

    public int findKthLargest(int[] nums, int k) {
        // 크기 k의 최소 힙
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            // 힙의 크기가 k 초과되면, 가장 작은 원소 제거
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // 마지막에 남아 있는 힙의 루트가 k번째 큰 원소
        return minHeap.peek();
    }
}

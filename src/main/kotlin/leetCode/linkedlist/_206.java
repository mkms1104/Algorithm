package leetCode.linkedlist;

import leetCode.hashmapset._1207;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _206 {
    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode listNode = new _206().reverseList(head);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next; // 다음 노드 미리 저장
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

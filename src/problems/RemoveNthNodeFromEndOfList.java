package problems;

import java.util.Stack;

public class RemoveNthNodeFromEndOfList {

    private RemoveNthNodeFromEndOfList() {
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (head.next != null) {
            stack.push(head);
            head = head.next;
        }
        stack.push(head);
        if ( n == 1) {
            if (stack.size() == 1) {
                node = null;
            }
            else {
                stack.get(stack.size() - 2).next = null;

            }
            return node;
        }
        if (stack.size()== n) {
            node = node.next;
            return node;
        }
        stack.get(stack.size() - n - 1).next = stack.get(stack.size() - n + 1);
        return node;
    }

    static class ListNode {
        int val;
        ListNode next;

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

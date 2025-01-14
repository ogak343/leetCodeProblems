package problems;

public class RotateList {
    private RotateList(){
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int length = 0;
        ListNode temp = head;
        ListNode newHead = head;
        while (head != null) {
            length++;
            head = head.next;
        }

        int range = (k % length) == 0 ? 0 : length - k % length;

        for (int i = 0; i < range; i++) {
            newHead = newHead.next;
        }
        ListNode result = newHead;

        for (int i = 0; i < length - 1; i++) {
            if (newHead.next == null) {
                newHead.next = new ListNode(temp.val);
                temp = temp.next;
            }
            newHead = newHead.next;
        }

        return result;
    }

    public static class ListNode {
        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }

        int val;
        ListNode next;

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

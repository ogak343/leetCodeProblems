package problems;

public class InsertGreatestCommonDivisorsInLinkedList {

    private InsertGreatestCommonDivisorsInLinkedList() {
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode result = head;

        while (head.next != null) {

            head.next = new ListNode(calculateGCD(head.val, head.next.val), head.next);
            head = head.next.next;
        }
        return result;
    }

    private static int calculateGCD(int val1, int val2) {

        int result = 1;

        for (int i = 2; i <= Math.min(val1, val2); i++) {
            if (val1%i == 0 && val2%i == 0) {
                result = i;
            }
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

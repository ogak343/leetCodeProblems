public class Main {

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(9);
        ListNode listNode1 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));

        System.out.println(addTwoNumbers(listNode1, listNode2));
    }


    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        boolean end = false;
        ListNode listNode = new ListNode(0);
        ListNode node = listNode;
        int extra = 0;

        while (!end) {
            long sum = extra;

            extra = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            node.val = (int) (sum % 10);
            extra = (int) (sum / 10);

            if (l1 == null && l2 == null && extra == 0) {
                end = true;
            } else {
                node.next = new ListNode(0);
                node = node.next;
            }
        }

        return listNode;
    }

}

class ListNode {
    long val;

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    ListNode next;

    ListNode() {
    }

    ListNode(long val) {
        this.val = val;
    }

    ListNode(long val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
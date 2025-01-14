package problems;

public class MergeTwoSortedLists {

    private MergeTwoSortedLists() {
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode result = new ListNode();
        ListNode r = result;
        boolean end = false;
        while (true) {
            if (list1 == null && list2 == null) {
                return list1;
            }
            if (list1 == null) {
                r.val = list2.val;
                r.next = list2.next;
                end = true;
            }
            else if (list2 == null) {
                r.val = list1.val;
                r.next = list1.next;
                end = true;
            }
            if (end) {
                break;
            }
            if (list1.val <= list2.val) {
                r.val = list1.val;
                list1 = list1.next;
                r.next = new ListNode();
                r = r.next;
            } else {
                r.val = list2.val;
                list2 = list2.next;
                r.next = new ListNode();
                r = r.next;
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




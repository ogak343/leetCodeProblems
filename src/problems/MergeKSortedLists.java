package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MergeKSortedLists {

    private MergeKSortedLists() {
    }

    static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        int offset = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                list.add(i - offset);
                lists[i - offset] = lists[i];
            } else {
                offset++;
            }
        }
        if (lists.length == 0 || lists[0] == null) {
            return null;
        }

        ListNode res = new ListNode();
        ListNode ret = res;
        AtomicInteger val = new AtomicInteger();
        AtomicInteger index = new AtomicInteger();
        while (!list.isEmpty()) {
            val.set(Integer.MAX_VALUE);
            list.forEach(x -> {
                if (lists[x].val <= val.get()) {
                    index.set(x);
                    val.set(lists[x].val);
                }
            });

            if (lists[index.intValue()].next != null) {
                lists[index.intValue()] = lists[index.intValue()].next;
            } else {
                list.remove(Integer.valueOf(index.intValue()));
            }
            res.val = val.get();
            if (!list.isEmpty()) {
                res.next = new ListNode();
                res = res.next;
            }
        }

        return ret;
    }
    static class ListNode {
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}

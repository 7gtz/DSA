/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        HashMap<Integer, ListNode> hm = new HashMap<>();
        int idx = 0;
        while (head != null) {
            hm.put(idx, head);
            head = head.next;
            idx++;
        }
        int n = hm.size();
        if (n <= 1) return;
        hm.get(n - 1).next = null;
        ListNode current = hm.get(0);
        ListNode dummy = current;
        int left = 1, right = n - 1;
        while (left <= right) {
            current.next = hm.get(right--);
            current = current.next;

            if (left > right) {
                break;
            }

            current.next = hm.get(left++);
            current = current.next;
        }

    current.next = null;

    }
}

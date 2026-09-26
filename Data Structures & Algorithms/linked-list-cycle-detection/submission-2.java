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
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode current = head;
        List<ListNode> covered = new ArrayList<>();
        covered.add(head);
        while (current.next != null) {
            if (covered.contains(current.next)) {
                return true;
            } 
            covered.add(current.next);
            current = current.next;
        }
        return false;
    }
}

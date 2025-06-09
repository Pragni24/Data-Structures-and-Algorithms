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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public int getSize(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        int size = getSize(head);
        int midIndex = size / 2;

        // Find middle node
        ListNode midNode = head;
        for (int i = 0; i < midIndex - 1; i++) {
            midNode = midNode.next;
        }

        // For even size, midNode.next is start of second half
        // For odd size, skip the middle element
        ListNode secondHalfStart = (size % 2 == 0) ? midNode.next : midNode.next.next;

        // Reverse second half
        ListNode reversedSecondHalf = reverse(secondHalfStart);

        // Compare first half and reversed second half
        ListNode p1 = head;
        ListNode p2 = reversedSecondHalf;
        boolean palindrome = true;
        while (p2 != null) {
            if (p1.val != p2.val) {
                palindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }


        return palindrome;
    }
}

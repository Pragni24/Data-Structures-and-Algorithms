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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy1 = head;
        ListNode dummy2 = head.next;
        ListNode temp1=dummy1;
        ListNode temp2 = dummy2;
        while(temp1.next!=null && temp2.next!=null){
            temp1.next=temp2.next;
            temp1=temp2.next;
            temp2.next=temp1.next;
            temp2=temp1.next;
        }
        temp1.next=dummy2;
        return dummy1;
    }
}

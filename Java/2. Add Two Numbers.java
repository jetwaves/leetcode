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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int digit = 0;
        ListNode currentNode = null;
        ListNode lastNode = null;
        ListNode firstNode = null;
        while(l1 !=null || l2 !=null || carry != 0){
            int v1 = (l1 != null)?l1.val:0;
            int v2 = (l2 != null)?l2.val:0;
            int sum = v1+v2+carry;
            if(sum>=10){
                digit = sum-10;
                carry = 1;
            } else {
                digit = sum;
                carry =0;
            }
            currentNode = new ListNode(digit, null);
            if(firstNode == null) firstNode = currentNode;
            if(lastNode != null) lastNode.next = currentNode;
            lastNode = currentNode;
            if( l1 !=null) l1 = l1.next;
            if( l2 !=null) l2 = l2.next;
        }
        return firstNode;
    }
}
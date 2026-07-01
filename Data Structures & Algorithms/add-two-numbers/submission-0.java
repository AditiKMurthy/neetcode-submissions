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
    private ListNode add(ListNode l1, ListNode l2, int carry) {
        if(l1==null && l2==null && carry==0) return null;

        int val1 = (l1!=null)? l1.val : 0;
        int val2 = (l2!=null) ? l2.val : 0;

        int sum = val1+val2+carry;
        int newCarry = sum/10;
        int nodeVal = sum%10;

        ListNode nextNode = add(
            l1!=null ? l1.next : null,
            l2!=null ? l2.next : null,
            newCarry
        );

        return new ListNode(nodeVal,nextNode);
        
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }
}

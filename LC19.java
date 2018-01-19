package OJ;

import java.util.List;

public class LC19 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }

    class Solution {
        /**
         * 2 passes .
          * @param head
         * @param n
         * @return
         */

        public ListNode removeNthFromEndTwoPass(ListNode head, int n) {

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            int size = 0;
            ListNode curr = head;
            while(curr != null){
                size++;
                curr = curr.next;
            }
            curr = dummy;
            int count = 0;
            while(count < size - n + 1){
                curr = curr.next;
                count ++;
            }
            curr.next = curr.next.next;
            return dummy.next;
        }

        /**
         * Fast and slow pointers
         * @param head
         * @param n
         * @return
         */
        public ListNode removeNthFromEndOnePass(ListNode head, int n) {
            ListNode dummyNode = new ListNode(0);
            dummyNode.next = head;

            int size = 1;
            ListNode first = head;
            ListNode second = dummyNode;

            while(size < n){
                first = first.next;
                size++;
            }
            while(first.next != null){
                first = first.next;
                second = second.next;
            }

            second.next = second.next.next;

            return dummyNode.next;
        }
    }

}

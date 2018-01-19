package OJ;

public class LC002 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        int extra = 0;

        while(l1 != null || l2 != null || extra != 0){
            if (l1 != null){
                extra += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                extra += l2.val;
                l2 = l2.next;
            }
            //res.next = new ListNode(extra % 10);
            //res = res.next;
            if (extra >= 10){
                res.next = new ListNode(extra % 10);
                res = res.next;
                extra = 1;
            }else {
                res.next = new ListNode(extra % 10);
                res = res.next;
                extra = 0;
            }
        }

        return head;
    }
}


public class ReverseKGroup25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        for (ListNode curr = head; curr != null; curr = curr.next) len++;
        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;
        for (ListNode prev = dummyhead, tail = head; len >= k; len -= k) {
            ListNode temp;
            //从1开始循环
            //循环体中都是套路
            for (int i = 1; i < k; i++) {
                temp = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = temp;
            }
            //从一开始循环则符合逻辑
            prev = tail;
            tail = prev.next;
        }
        return dummyhead.next;
    }

    public static class ListNode  {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

    }
}

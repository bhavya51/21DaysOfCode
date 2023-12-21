class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        // finding the middle element
        ListNode mid = head;
        if (size == 1) {
            head = null;
            return head;
        }
        for (int i = 0; i < (size / 2); i++) {
            mid = mid.next;
        }
        // finding the element before mid element
        ListNode prev = head;
        for (int i = 0; i < (size / 2) - 1; i++) {
            prev = prev.next;
        }
        // after finding the middle and prev element
        prev.next = mid.next;
        return head;
    }
}

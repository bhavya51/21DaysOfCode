class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp1 = new ListNode(0);
        temp1.next = head;
        ListNode temp = temp1;
        while(temp.next!=null){
            if(temp.next.val==val) temp.next = temp.next.next; 
            else temp = temp.next;
        }
        return temp1.next;
    }
}

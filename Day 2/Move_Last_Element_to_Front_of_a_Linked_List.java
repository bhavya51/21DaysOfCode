class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if(head.next == null || head == null) return head;
        Node curr = head;
        Node prev = null;
        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
        }
        curr.next = head;
        prev.next = null;
        head = curr;
        return head;
    }
}

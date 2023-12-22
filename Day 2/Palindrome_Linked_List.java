class Solution {
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        // step 1 - find mid
        ListNode midNode = findMid(head);
        // step 2 - reverse 2nd half
        ListNode prev = null;
        ListNode curr = midNode; 
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;// head of right half
        ListNode left = head; // head of right half
        // step 3 - check 1st and 2nd half
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next; 
        }
        return true;     
    }
}

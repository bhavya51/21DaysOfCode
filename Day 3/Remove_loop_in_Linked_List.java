class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node s = cycledetection(head);
        
        // No loop found
        if (s == null) {
            return;
        }

        Node start = head;

        while (s != start) {
            start = start.next;
            s = s.next;
        }

        Node ans = s;
        Node temp = ans;
        while (temp.next != ans) {
            temp = temp.next;
        }

        temp.next = null;
    }
    
    public static Node cycledetection(Node head) {
        Node s = head;
        Node f = head;
        
        // Null check
        if (head == null) {
            return null;
        }

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                return s;
            }
        }

        return null; // No loop detected
    }
}

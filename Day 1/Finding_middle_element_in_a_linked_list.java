class Solution
{
    int getMiddle(Node head)
    {
        // Your code here.
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size==1){
            return head.data;
        }
        Node prev = head;
        for(int i = 0; i< (size/2); i++){
            prev = prev.next;
        }
        return prev.data;
    }
}

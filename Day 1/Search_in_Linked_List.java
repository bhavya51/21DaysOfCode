class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                return true; // return true if key is found
            }
            temp = temp.next;
        }
        return false; // return false if key is not found
    }
}

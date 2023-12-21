class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// calculate size
    	int size = 0;
    	Node temp = head;
    	while(temp!=null){
    	    temp = temp.next;
    	    size++;
    	}    	
    	//base case
    	if(n==size) return head.data;
        if(n > size || n <= 0) return -1;
    	// getting nth node from last
    	Node prev = head;
    	int target = size - n;
    	for(int i = 0; i<=target-2; i++){
    	    prev = prev.next;
    	}
    	// getting prev to point at the nth element , storing and returning the value
    	prev = prev.next;
    	int val = prev.data;
    	return val;
    }
}

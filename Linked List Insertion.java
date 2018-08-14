/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class GFG
{
// function inserts the data in front of the list and returns the head of LL.
	Node insertAtBeginning(Node head1,int a1)
	{
	    //Add your code here.
	    Node temp = new Node(a1);

	   temp.next = head1;
	    head1 = temp;
	    return head1;
	}
// function appends the data at the end of the list and returns the head of LL.
	Node insertAtEnd(Node head1,int a1)
	{
	    //Add your code here.
	    Node temp = new Node(a1);
	    if(head1 == null)
	    {
	        head1 = temp;
	        return head1;
	    }
	    Node ptr = head1;
	    while(ptr.next != null)
	    {
	        ptr = ptr.next;
	    }
	    ptr.next = temp;
	    return head1;
	}
}

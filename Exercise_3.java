// Time Complexity : O(n)
// Space Complexity : O(1)

class LinkedList 
{ 
    Node head; // head of linked list 
  
    /* Linked list node */
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to print middle of linked list */
   //Complete this function
    void printMiddle() 
    { 
        //Write your code here
	//Implement using Fast and slow pointers
	// Initialize fast and slow pointers to the head of the list
	    Node fastPointer = head;
	    Node slowPointer = head;
	
	    // Check if the list is not empty
	    if (head != null) {
	        // Traverse the list with two pointers
	        // Fast pointer moves two steps at a time, hence we check up to .next.next for null in the while loop condition
	        while (fastPointer != null && fastPointer.next != null && fastPointer.next.next != null) {
	            fastPointer = fastPointer.next.next; // Move fast pointer two steps forward
	            slowPointer = slowPointer.next; // Move slow pointer one step forward
	        }
	
	        // At this point, slow pointer is pointing to the middle node
	        System.out.println("The middle element is: " + slowPointer.data);
	    }
	    else {
	        // If the list is empty, print appropriate message
	        System.out.println("The list is empty.");
	    }
		
	}
    } 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) 
    { 
        LinkedList llist = new LinkedList(); 
        for (int i=15; i>0; --i) 
        { 
            llist.push(i); 
            llist.printList(); 
            llist.printMiddle(); 
        } 
    } 
} 

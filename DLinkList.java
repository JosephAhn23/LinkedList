/** 
 * Builds a singly linked list of size 5 and prints it to the console.
 * 
 * @author Jochen Lang
 */

 class LinkList<E> {
    DNode llist;
	private DNode head;
    private DNode tail;


    LinkList( int sz ) {
	if ( sz <= 0 ) {
	    llist = null;
        head=null;
        tail=null;
	}
	else {
	    // start with list of size 1
	    llist = new DNode( "0", null, null ); 
	    DNode current = llist; // temp node for loop
	    // add further nodes
	    for ( int i=1; i<sz; ++i ) {
		// create node and attach it to the list
		DNode node2Add = new DNode( Integer.toString(i), null, null );
		current.setNext(node2Add);   // add first node
		current=node2Add;
	    }
	}
    }
    
    /**
     * Print all the elements of the list assuming that they are Strings
     */
    public void print() {
	/* Print the list */
	DNode current = llist; // point to the first node
	while (current != null) {
	    System.out.print((String)current.getElement() + " ");	
	    current = current.getNext(); // move to the next
	}
	System.out.println();	
    }

    public void deleteFirst() {
	if ( llist != null ) {
	    llist = llist.getNext();
	}
    }

    public void deleteLast() {
        if (llist == null) { // empty list
            return;
        }
    
        if (llist.getNext() == null) { // 1 node
            llist = null;
        } else {
            DNode current = llist;
            // Traverse to the second-to-last node
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            // Remove the last node
            current.setNext(null);
        }
    }
    
    

    // create and display a linked list
    public static void main(String [] args){
		LinkList<String> list = new LinkList<>(5);
        System.out.print("Initial List: ");
        list.print(); // Expected: 0 1 2 3 4

         list.deleteFirst();
        System.out.print("After Deleting First: ");
        list.print(); // Expected: 1 2 3 4

         list.deleteLast();
        System.out.print("After Deleting Last: ");
        list.print(); // Expected: 1 2 3

         list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        System.out.print("After Deleting All: ");
        list.print(); // Expected: (empty list
    }
}

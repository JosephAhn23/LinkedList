/** 
 * Builds a singly linked list of size 5 and prints it to the console.
 * 
 * @author Jochen Lang
 */

class GLinkList<E> {
    GNode llist;
	private GNode<E> head;
    private GNode<E> tail;


    GLinkList( int sz ) {
	if ( sz <= 0 ) {
	    llist = null;
	}
	else {
	    // start with list of size 1
	    llist = new GNode( "0", null ); 
	    GNode current = llist; // temp node for loop
	    // add further nodes
	    for ( int i=1; i<sz; ++i ) {
		// create node and attach it to the list
		GNode node2Add = new GNode( Integer.toString(i), null );
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
	GNode current = llist; // point to the first node
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
        if (tail == null) {  
            return;
        }

        if (tail == head) {  
            head = null;
            tail = null;
            return;
        }

         
        GNode<E> current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        tail = current;
        tail.setNext(null);
    }

    // create and display a linked list
    public static void main(String [] args){
		/* Create the list */
		LinkList llist = new LinkList( 5 );
		/* Print the list */
		llist.print();
		/* delete first and print */
		llist.deleteFirst();
		llist.print();
		/* delete last and print 5 times */
		for ( int i=0; i< 5; ++i ) {
			llist.deleteLast();
			llist.print();
		}
    }
}

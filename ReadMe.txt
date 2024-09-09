1) Singly Linked List
Download the archive lab1.zip and extract the singly linked list implementation contained in the following files
LinkList.java
Node.java
Compile and run LinkList.java and study its behaviour.

2) Doubly Linked Lists
Change the singly-linked-list to a doubly-linked-list by changing Node.java to DNode.java.
Change the LinkList class to work with DNode, in particular, adapt the implementation of the void LinkList.deleteLast() method.
NOTE 1 : A doubly linked list can be implemented with or without dummy head and trailer nodes; it is your choice.

NOTE 2 : Your implementation of deleteLast() for the doubly linked list should be more efficient than the given one 
for singly linked list. Efficiency counts here.

3) Using Generics
The archive lab1.zip also contains the file GNode.java which implements a node for a singly-linked-list as before but instead of storing a reference to an Object, it uses a generic element.
Adapt the original LinkList class to use the generic Gnode class.
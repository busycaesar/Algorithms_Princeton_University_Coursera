public class LinkedQueueOfStrings {
    
    // Data Members

    // This is the Node class for creating the Nodes to store in the Queue.
    private class Node {
        public String item;
        public Node next;
    }

    // This are the variables to store the address of the front node in the queue and the last node in the queue.
    private Node front, last;

    // Member Functions

    // This is the method to find if the queue is empty.
    public boolean isEmpty() { return first == null; }

    // This is the method to add an item at the back of the queue.
    public void enqueue(String item)
    {

        // Storing the address of the last node in the queue.
        Node current_last = last;

        // Creating the new node and store its address as a new last node in the queue.
        last = new Node();

        // Adding the values into the new last node.
        last.item = item;
        last.next = null;

        // If the list is empty, the new last is also the first node in the queue, else pointing the old last to the new last node in the queue.
        if (isEmpty()) first = last;
        else current_last.next = last;

    }

    // This is the method to get the front node in the queue.
    public String dequeue()
    {

        // Storing the item in the front of the queue.
        String item = front.item;

        // Switching the current front to the next node in the queue.
        front = front.next;

        // If the queue is empty upon removing the node from the front, updating the address of the last node in the queue to the same as front, i.e. null.
        if(isEmpty()) last = front;
        
        // Returning the item which was in the front of the queue.
        return item;

    }

}

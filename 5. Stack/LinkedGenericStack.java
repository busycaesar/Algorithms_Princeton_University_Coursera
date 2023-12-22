// This is a stack data structure to store the data of a generic type rather than developing different stack DSs for storing various types of items such as Strings, Ints, Doubles or any custom object.
// Here the term "<Item>" would pass the type of the object to be stacked.
public class LinkedGenericStack<Item> {
    
    // Data Members

    // This will point to the toppest node in the stack.
    private Node top = null;

    // This class defines the structure of the Node to be stacked.
    private class Node{

        // This would declare the variable named "item" to be a custom type passed while declaring the stack.
        Item item;

        // This would point to the node at the bottom of the current node in the stack.
        Node bottom;

    }

    // Member Functions

    // This function indicates if the stack is empty or not.
    public boolean isEmpty() {return top == null;}

    // This function pushes a new item to the top of the stack.
    public void push(Item item)
    {

        // First storing address of the the toppest node in the stack.
        Node current_top = top;

        // Creating a new node and storing its address in the top variable.
        top = new Node();

        // Storing the item passed into the newly created node object.
        top.item = item;

        // Connecting the newly created node with the former top node.
        top.bottom = current_top;

    }

    // This function removes the item from the top of the stack.
    public Item pop()
    {

        // Storing the item on the top of the stack.
        Item item = top.item;

        // Updating the address stored in the top to the second top item in the stack.
        top = top.bottom;

        // Returning the item which was formerly on the top.
        return item;

    }

}

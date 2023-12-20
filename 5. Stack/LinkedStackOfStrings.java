// This is the class for LinkedList Data Structure. It stores strings in its nodes.
public class LinkedStackOfStrings{
    
    // Data Members.

    // This is the class for Nodes Data Structure. It stores strings and is being stored in form of stack in the linked list.
    private class Node{
        
        // Data Members

        // This will store the string in the node.
        private String item;

        // This will store the address of the bottom node.
        private Node bottom_node;

        // Constructors

        // This is used to create a node with the item without adding the address of the bottom node. 
        Node(String item_to_add)
        {
            item = item_to_add;
            bottom_node = null;
        }

        // This is used to create a node with both, the item and the address to the bottom node.
        Node(String item_to_add, Node bottom_node_address)
        { 
            item = item_to_add;
            bottom_node = bottom_node_address;
        }

        // Methods

        // These methods are for getting and setting of the item in the node.
        public String getItem(){return item;}
        public void setItem(String updated_item){item = updated_item;}

        // This methods are for getting and setting the address of the bottom node.
        public Node getBottomNode(){return bottom_node;}
        public void setBottomNode(Node new_botton_node){bottom_node = new_botton_node;}

    }

    // This points to the top node in the stack of linked list.
    private Node top = new Node("");

    // Methods.

    // This indicates if the linked list is empty or not.
    public boolean isEmpty(){return top.getItem() == "";}

    // This is used to store a new item on the stack of linked list.
    public void push(String item)
    {

        // If the stack is empty, the item would be stored in the top node.
        if(isEmpty()){top.setItem(item);}

        // If the stack already have nodes, a new nodes would be created with the value of item and address of the bottom node would be equal to the address of current top node.
        else top = new Node(item, top);

    }

    // This is used to remote the item from the top of the stack of linked list.
    public String pop()
    {

        // Getting the string from the node on the top of the stack.
        String item_to_bo_removed = top.getItem();

        // If the stack is not empty, the address of the top node would be set to the bottom of the current top node.
        if(!isEmpty()) {top = top.getBottomNode();}

        // Returning the string got from the former top of the stack.
        return item_to_bo_removed;

    }

}
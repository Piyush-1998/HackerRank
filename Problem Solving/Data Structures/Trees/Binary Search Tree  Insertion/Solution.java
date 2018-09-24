/*

class Node {
    int data;
    Node left;
    Node right;
}

*/

public static Node insert(Node root, int data) {

    Node current = root;

    if(current == null) {
        
        return new Node(data);
    }

    while((current.left != null && current.data > data) 
          || (current.right != null && current.data < data)) {
        
        if(current.data < data) {

            current = current.right;
        }
        else {

            current = current.left;
        }
    }

    Node temp = new Node(data);
    
    if(current.data < data) {
        
        current.right = temp;
    }
    else {
        
        current.left = temp;
    }

    return root;
}
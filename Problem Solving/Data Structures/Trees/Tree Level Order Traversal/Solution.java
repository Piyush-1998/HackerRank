/*

class Node {
    int data;
    Node left;
    Node right;
}

*/

public static void levelOrder(Node root) {
      
    Queue<Node> queue = new LinkedList<Node>();
    
    queue.add(root);
    
    while(queue.size() > 0) {
        
        Node current = queue.poll();
        
        System.out.print(current.data + " ");
    
        if(current.left != null) {
            
            queue.add(current.left);
        }
        
        if(current.right != null) {
            
            queue.add(current.right);
        } 
    }
}

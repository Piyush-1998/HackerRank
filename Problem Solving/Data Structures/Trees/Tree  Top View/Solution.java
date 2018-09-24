/*

class Node {
    int data;
    Node left;
    Node right;
}

*/

class QueueItem {
    
    int horizontalDistance;
    Node node;
    
    QueueItem(int horizontalDistance, Node node) {
        
        this.horizontalDistance = horizontalDistance;
        this.node = node;
    }  
}

public static void topView(Node root) {
  
    int level = 0;
    int horizontalDistance = 0;
    topViewUtil(root, level);
}

public static void topViewUtil(Node root, int level) {
    
    Solution forQueue = new Solution();
    
    Queue<forQueue.new QueueItem(0, root)> queue = new LinkedList<Node>();
    
    queue.add(root);
    
    while(queue.size() > 0) {
                
        Node currentNode = queue.poll();
        
        if(currentNode.left != null) {
            
            queue.add(currentNode.left);
            
        }
        
        if(currentNode.right != null) {
            
         
            queue.add(currentNode.right);
        }
    }
}
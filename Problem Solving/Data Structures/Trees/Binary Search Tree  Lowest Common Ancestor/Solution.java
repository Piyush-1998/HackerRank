/*

class Node {
    int data;
    Node left;
    Node right;
}

*/

public static Node lca (Node root, int v1, int v2) {
    
    LinkedList<Node> lcaNodes = new LinkedList<Node>();
    
    findLCA(root, v1, v2, lcaNodes);
    
    return lcaNodes.get(lcaNodes.size() - 1);
}

public static void findLCA(Node root, int v1, int v2, LinkedList<Node> lcaNodes) {
    
    if(root == null) {
        
        return;
    }
    
    if(root.left != null || root.right != null) {
        
        int value = findValues(root, v1, v2);

        if(value == 2) {

            lcaNodes.add(root);
        }
    }
    
    findLCA(root.left, v1, v2, lcaNodes);
    findLCA(root.right, v1, v2, lcaNodes);
}

public static int findValues(Node root, int v1, int v2) {
    
    if(root == null) {
        
        return 0;
    }
    
    if(root.data == v1) {
        
        return 1 + findValues(root.left, v1, v2) + findValues(root.right, v1, v2);
    }
    
    if(root.data == v2) {
        
        return 1 + findValues(root.left, v1, v2) + findValues(root.right, v1, v2);
    }
    
    return findValues(root.left, v1, v2) + findValues(root.right, v1, v2);
}
/*

class Node {
    int data;
    Node left;
    Node right;
}

*/

public boolean checkBST(Node root) {
    
    ArrayList<Integer> inOrder = new ArrayList<Integer>();
    
    checkBSTUtil(root, inOrder);
    
    for(int i = 1; i < inOrder.size(); i++) {
        
        if(inOrder.get(i) <= inOrder.get(i - 1)) {
            
            return false;
        }
    }
    
    return true;
}

public void checkBSTUtil(Node root, ArrayList<Integer> inOrder) {
    
    if(root == null) {
        
        return;
    }
    
    checkBSTUtil(root.left, inOrder);
    inOrder.add(root.data);
    checkBSTUtil(root.right, inOrder);
}

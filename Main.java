class Node{
    int data;
    Node left, right;
    
    Node(int item){
        data=item;
        left=right=null;
    }
}
    public class binaryTree{
        Node root;
        // Count the number of nodes.
        static int countNumNodes(Node root){
            if(root==null) return (0);
            return 1+countNumNodes(root.left)+countNumNodes(root.right);
        } 
        // Check for complete Binary Tree.
        static boolean checkComplete(Node root, int index, int numNodes){
            // Check if the Tree is empty.
            if(root==null) return true;
            if(index>=numNodes) return false;
            return checkComplete(root.left, 2*index+1, numNodes)&&checkComplete(root.right, 2*index+2, numNodes);
        }
        public static void main(String[] args){
            binaryTree tree=new binaryTree();
            tree.root= new Node(1);
            tree.root.left= new Node(2);
            tree.root.right= new Node(3);
            tree.root.left.left= new Node(4);
            tree.root.left.right= new Node(5);
            tree.root.right.left= new Node(6);
            int nodeCount=tree.countNumNodes(tree.root);
            int index=0;
            if(tree.checkComplete(tree.root, index, nodeCount)){
                System.out.println("The tree is a Complete Binary Tree.");
            }
            else System.out.println("The tree is not a Complete Binary Tree.");    
           
        }
    }

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data= data;
        this.left= null;
        this.right=null;
    }
}
class BinaryTree{
    Node root;
    Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
       System.out.print(root.data+" ");
       
    }
}
class PostorderTraversal {
    public static void main(String[] args) {
       BinaryTree tree = new BinaryTree();

        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        tree.postorder(tree.root);
    }
}
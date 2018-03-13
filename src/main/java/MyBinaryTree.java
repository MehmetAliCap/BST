import org.omg.CORBA.NO_IMPLEMENT;

public class MyBinaryTree {
    Node root;

    public MyBinaryTree() {
        root = null;
    }
    public MyBinaryTree(Node root){
        this.root = root;
    }

    public void visit(Node p){

        System.out.print(p.info+" ");
    }

    public void preOrder(Node root){
        if (root == null)
            return;
        visit(root);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root){
        if (root == null)
            return;
        inOrder(root.left);
        visit(root);
        inOrder(root.right);
    }
    public void postOrder(Node root){
        if (root == null)
            return;
        preOrder(root.left);
        postOrder(root.right);
        visit(root);
    }

}

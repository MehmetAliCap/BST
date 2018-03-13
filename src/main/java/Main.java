public class Main {
    public static void main(String[] args) {
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n9 = new Node(9);
        Node n5 = new Node(5);
        Node n2 = new Node(2);
        Node n1 = new Node(1);

        n7.left = n5;
        n7.right = n2;

        n9.left = n1;

        n6.left = n7;
        n6.right = n9;

        MyBinaryTree mbt = new MyBinaryTree(n6);

        mbt.preOrder(mbt.root);
        System.out.println();
        mbt.inOrder(mbt.root);
        System.out.println();
        mbt.postOrder(mbt.root);
    }
}

public class Node {
    int info;
    Node left;
    Node right;

    //create a leaf node
    public Node(int info) {
        this.info = info;
        left = right = null;

    }
}

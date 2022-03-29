public class App {
    public static void main(String[] args) throws Exception {
        Tree tree = new Tree();
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        tree.setRoot(root);
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);

        // System.out.println(tree.nodesNumber(root));
        // System.out.println(tree.treeHeight(root));
        // System.out.println(tree.findNode(root, 1));
        // tree.preOrderDepth(root);
        tree.inOrder(root);

    }
}

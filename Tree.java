import java.util.LinkedList;
import java.util.Queue;

public class Tree {
  public Node root = null;

  public Tree() {
  }

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public int nodesNumber(Node node) {
    if (node == null) {
      return 0;
    }
    return 1 + nodesNumber(node.getLeft()) + nodesNumber(node.getRight());
  }

  public int treeHeight(Node node) {
    if (node == null) {
      return 0;
    }

    return 1 + Math.max(treeHeight(node.getLeft()), treeHeight(node.getRight()));
  }

  public boolean findNode(Node node, int value) {
    if (node == null) {
      return false;
    }
    if (node.getValue() == value) {
      return true;
    }

    return findNode(node.getLeft(), value) || findNode(node.getRight(), value);
  }

  public void preOrderDepth(Node node) {
    if (node == null) {
      return;
    }

    System.out.print(node.getValue() + " ");

    preOrderDepth(node.getLeft());
    preOrderDepth(node.getRight());
    return;
  }

  public void inOrder(Node node) {
    if (node == null) {
      return;
    }

    inOrder(node.getLeft());
    System.out.print(node.getValue() + " ");
    inOrder(node.getRight());
    return;
  }

  public void posOrder(Node node) {
    if (node == null) {
      return;
    }

    inOrder(node.getLeft());
    inOrder(node.getRight());
    System.out.print(node.getValue() + " ");
    return;
  }

  public void breadthSearch(Node node) {

  }
}

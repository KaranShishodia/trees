package trees;

public class InvertBinaryT {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public Node invertTree(Node root) {
        if (root == null)
            return root;
        Node l = root.left;
        Node r = root.right;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}

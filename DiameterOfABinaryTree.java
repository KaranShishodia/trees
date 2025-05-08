package trees;

public class DiameterOfABinaryTree {
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

    public static int height(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int diameterOfBinaryTree(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return 0;

        int leftans = diameterOfBinaryTree(root.left);
        int rightans = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if (root.left != null)
            mid++;
        if (root.right != null)
            mid++;
        int max = Math.max(leftans, Math.max(rightans, mid));
        return max;
    }

    public static void main(String[] args) {

    }

}

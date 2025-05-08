package trees;

public class BalancedBTree {
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

    public boolean isBalanced(Node root) {
        if (root == null)
            return true;
        int hl = height(root.left);
        if (root.left != null)
            hl++;
        int hr = height(root.right);
        if (root.right != null)
            hr++;
        int d = hl - hr;
        if (d < 0)
            d = -d;
        if (d > 1)
            return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }

}

package trees;

public class lowestCommonAncestorBTree {
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

    public boolean contains(Node root, Node node) {
        if (root == null)
            return false;
        if (root == node)
            return true;
        return contains(root.left, node) || contains(root.right, node);
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (p == root && q == root)
            return root;
        if (p == q)
            return p;
        boolean leftp = contains(root.left, p);
        boolean rightq = contains(root.right, q);
        if (leftp && rightq)
            return root;
        if (leftp == true && rightq == false)
            return lowestCommonAncestor(root.left, p, q);
        if (leftp == false && rightq == true)
            return lowestCommonAncestor(root.right, p, q);
        if (leftp == false && rightq == false)
            return root;
        return root;
    }

}

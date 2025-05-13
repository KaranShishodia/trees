package trees;

public class SymmetricTree {
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

    public boolean isSameT(Node p, Node q) {
        if (p == null && q == null)
            return true;
        if (p == null)
            return false;
        if (q == null)
            return false;
        if (p.val != q.val)
            return false;
        return isSameT(p.left, q.left) && isSameT(p.right, q.right);
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

    public boolean isSymmetric(Node root) {
        root.left = invertTree(root.left);
        return isSameT(root.left, root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
    }
}

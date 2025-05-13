package trees;

public class SameTree {
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
}

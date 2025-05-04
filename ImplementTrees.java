package trees;

public class ImplementTrees {
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

    public static void display(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ->");
        if (root.left != null)
            System.out.println(root.left.val + " ," + root.right.val);
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        display(root);
        // Output: 1 -> 2 ,3
        // 2 -> 4 ,5
        // 3 -> 6 ,7
        // 4 -> null ,null
        System.out.println("Tree structure displayed above.");
        // You can add more functionality to the tree, such as searching, inserting,
        // deleting nodes, etc.
    }
}

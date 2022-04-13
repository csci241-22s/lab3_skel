package lab3;

/** a binary search tree class for Lab 3, part 2: Recursion on Trees*/
public class BST {
    public Node root;
    public String traversal;
    /** constructor: create an empty BST */
    public BST() {
        root = null;
    }

    /* return true iff Node n is a leaf node. a null node is not considered
     * a leaf. */
    public boolean isLeaf(Node n) {
        return false; //TODO
    }

    /** return the number of nodes in the tree */
    public int size() {
        return size(root);
    }

    /* number of nodes in the tree rooted at n
     * = 0 if n is null
     * = 1 + number of nodes in left + number of nodes in right */
    private int size(Node n) {
        return 0; // TODO
    }


    /** appends the values in the tree to String traversal using an in-order traversal */
    public void inOrder() {
        traversal = "";
        inOrder(root);
    }
    private void inOrder(Node n) {
        // TODO
    }


    /**  appends the values in the tree to String traversal using a pre-order traversal */
    public void preOrder() {
        traversal = "";
        preOrder(root);
    }
    private void preOrder(Node n) {
        // TODO
    }

    /** appends the values in the tree to String traversal using a post-order traversal */
    public void postOrder() {
        traversal = "";
        postOrder(root);
    }
    private void postOrder(Node n) {
        //TODO
    }

    /** return the height of the tree.
     *  recall that the height is the path length from the deepest leaf to the
     *  root. special case: an empty tree (root == null) is defined to have
     *  height = -1 */
    public int height() {
        return height(root);
    }

    /* return the height of the tree rooted at n */
    private int height(Node n) {
        return 0; // TODO
    }

    /** inner class representing a node in the tree. */
    public class Node {
        public int value;
        public Node parent;
        public Node left;
        public Node right;

        /** constructor: gives default values to all fields */
        public Node() { }

        /** constructor: sets only value */
        public Node(int v) {
            value = v;
        }

        /** constructor: sets value and parent fields */
        public Node(int v, Node p) {
            value = v;
            parent = p;
        }

        /** constructor: sets all fields */
        public Node(int v, Node p, Node l, Node r) {
            value = v;
            parent = p;
            left = l;
            right = r;
        }
    }


    /* methods for testing */

    /** constructor: constructs various BST instances for testing */
    public BST(int testCase) {
        switch(testCase) {
            case 0:
                root = null;
                break;
            case 1:
                root = new Node(4);
                break;
            case 2:
                root = new Node(4);
                root.left = new Node(2);
                root.right = new Node(6);
                break;
            case 3:
                root = new Node(4);
                root.left = new Node(2);
                root.right = new Node(6);
                root.right.right = new Node(7);
                root.right.right.right = new Node(8);
                root.right.right.right.right = new Node(9);
                break;
            case 4:
                root = new Node(4);
                root.left = new Node(2);
                root.right = new Node(6);
                root.right.right = new Node(7);
                root.right.right.right = new Node(8);
                root.right.right.right.right = new Node(9);
                root.left.left = new Node(1);
                root.left.left.left = new Node(0);
                break;
        }
    }

    /** print a sideways representation of the tree - root at left,
     * right is up, left is down. */
    public void printTree() {
        printSubtree(root, 0);
    }
    private void printSubtree(Node n, int level) {
        if (n == null) {
            return;
        }
        printSubtree(n.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("        ");
        }
        System.out.println(n.value);
        printSubtree(n.left, level + 1);
    }
}

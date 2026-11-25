public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {

    }

    public void insert(Node n) {
        if (root == null) {
            root = n;
            return;
        }

        Node curr = root;
        while (true) {
            // Go left
            if (n.value < curr.value) {
                if (curr.left == null) {
                    curr.left = n;
                    return;
                }

                curr = curr.left;
            } else {
                if (curr.right == null) {
                    curr.right = n;
                    return;
                }

                curr = curr.right;
            }
        }
    }

    public int search(int value) {
        Node curr = root;
        if (curr == null) {
            return -1;
        }

        int count = 0;
        while (curr != null) {
            count++;
            if (value > curr.value) { // Go right
                curr = curr.right;
            } else if (value < curr.value) { // Go left
                curr = curr.left;
            } else { // Found it
                return count;
            }
        }

        return -1;
    }

    public int height(Node n) {
        if (n == null) {
            return -1;
        }

        int l = height(n.left);
        int r = height(n.right);

        return Math.max(l, r) + 1;
    }
}

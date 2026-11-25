
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    // Test inserting into an empty tree
    @Test
    public void testInsertRoot() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(50));

        assertNotNull(bst.root);
        assertEquals(50.0, bst.root.value);
    }

    // Test inserting left and right children
    @Test
    public void testInsertChildren() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(50));
        bst.insert(new Node(30));
        bst.insert(new Node(70));

        assertEquals(30.0, bst.root.left.value);
        assertEquals(70.0, bst.root.right.value);
    }

    // Test searching for the root
    @Test
    public void testSearchRoot() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new Node(50));

        assertEquals(1, bst.search(50));
    }

    // Test searching for deeper nodes
    @Test
    public void testSearch() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(50));
        bst.insert(new Node(30));
        bst.insert(new Node(70));
        bst.insert(new Node(20));

        assertEquals(2, bst.search(30));
        assertEquals(2, bst.search(70));
        assertEquals(3, bst.search(20));
    }

    // Test searching for a nonexistent value
    @Test
    public void testSearchMissing() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(50));
        bst.insert(new Node(30));

        assertEquals(-1, bst.search(100));
    }

    // Test height of a balanced tree
    @Test
    public void testHeight() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(50));
        bst.insert(new Node(30));
        bst.insert(new Node(70));
        bst.insert(new Node(20));
        bst.insert(new Node(40));

        assertEquals(2, bst.height(bst.root));
    }

    // Test height of an empty tree
    @Test
    public void testEmptyHeight() {
        BinarySearchTree bst = new BinarySearchTree();

        assertEquals(-1, bst.height(bst.root));
    }

    // Test height of a single-node tree
    @Test
    public void testSingleNodeHeight() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(new Node(25));

        assertEquals(0, bst.height(bst.root));
    }
}

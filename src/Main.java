import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        int k = 10000;

        Random rand = new Random();

        for (int n : sizes) {
            int totalHeight = 0;
            int totalNodesVisited = 0;

            for (int count = 0; count < 10; count++) {
                BinarySearchTree bst = new BinarySearchTree();
                ArrayList<Integer> arr = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    int val = rand.nextInt(k) + 1;

                    bst.insert(new Node(val));
                    arr.add(val);
                }

                for (int val : arr) {
                    totalNodesVisited += bst.search(val);
                }

                totalHeight += bst.height(bst.root);
            }

            double avgHeight = totalHeight / 10.0;
            double avgNodes = totalNodesVisited / (10.0 * n);

            System.out.println("N = " + n);
            System.out.println("Average Height: " + avgHeight);
            System.out.println("Average Nodes Visited: " + avgNodes);
            System.out.println();
        }
    }
}
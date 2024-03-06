package App;

import Data.DataTree;
import Node.Node;
import Tree.BinaryTree;

import java.util.Scanner;

public class Application {
    private static DataTree tree = new DataTree();
    private static Node root = tree.buildTree();
    private static BinaryTree trav = new BinaryTree();
    private static boolean continueWorking = true;
    private static Scanner sc = new Scanner(System.in);

    private static void display() {
        System.out.println("""
                Choose which method you want to use
                1. Inorder traversal;
                2. Preorder traversal;
                3. Postorder traversal;
                4. Close application.
                Enter number:
                """);
    }

    public static void appStart() {
        while (continueWorking) {
            System.out.println("\n_____________________");
            display();
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1 -> {
                        System.out.println("Inorder traversal");
                        trav.inorder(root);
                    }
                    case 2 -> {
                        System.out.println("Preorder traversal");
                        trav.preorder(root);
                    }
                    case 3 -> {
                        System.out.println("Postorder traversal");
                        trav.postorder(root);
                    }
                    case 4 -> {
                        System.out.println("Have a good day!");
                        continueWorking = false;
                    }
                    default -> System.out.println("Enter correct number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
        sc.close();
    }

}

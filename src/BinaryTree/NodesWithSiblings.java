package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 29-07-2017.
 */
public class NodesWithSiblings {
    static Scanner s = new Scanner(System.in);
    public static node<Integer> createTree(){
        int data = s.nextInt();
        if (data == -1){
            return null ;
        }
        node<Integer> root = new node<>(data);
        root.left = createTree();
        root.right = createTree();
        return root ;
    }

    public static void printNodesWithoutSibling(node<Integer> root){
        if (root == null)
            return;
        if (root.right == null && root.left != null)
            System.out.print(root.left.data + " ");
        if (root.right != null && root.left == null)
            System.out.print(root.right.data + " ");
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        printNodesWithoutSibling(root);
    }
}

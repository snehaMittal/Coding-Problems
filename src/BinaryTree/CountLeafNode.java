package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 28-07-2017.
 */
public class CountLeafNode {
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
    static int count=0 ;

    public static int noOfLeafNodes(node<Integer> root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            count++;
        }
        noOfLeafNodes(root.left);
        noOfLeafNodes(root.right);
        return count ;
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(noOfLeafNodes(root));
    }
}

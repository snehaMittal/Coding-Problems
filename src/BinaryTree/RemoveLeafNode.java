package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 28-07-2017.
 */
public class RemoveLeafNode {
//4 2 9 1 3 5 6 -1 -1 -1 -1 -1 -1 -1 -1
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
    public static void print(node<Integer> root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    public static node<Integer> removeAllLeaves(node<Integer> root){
        if (root == null){
            return null ;
        }
        if (root.left == null && root.right == null){
            root = null;
            return root ;

        }
        root.left = removeAllLeaves(root.left);
        root.right =removeAllLeaves(root.right);
        return root ;
    }
    public static void main(String[] args) {
        node<Integer> root = createTree();
        root = removeAllLeaves(root);
        print(root);
    }
}

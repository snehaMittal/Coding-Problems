package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 25-07-2017.
 */
public class MirrorTree {
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

    public static <T> void mirror(node<T> root){
        if (root == null){
            return;
        }
        node<T> temp = root.right;
        root.right = root.left ;
        root.left = temp ;
        mirror(root.right);
        mirror(root.left);
    }
    public static void print(node<Integer> root){
        if (root == null){
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        mirror(root);
        print(root);
    }
}

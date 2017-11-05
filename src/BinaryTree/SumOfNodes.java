package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 28-07-2017.
 */
public class SumOfNodes {

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

    public static int sum(node<Integer> root){
        if (root == null)
            return 0 ;

        return root.data + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {
        node<Integer> root = createTree() ;
        System.out.println(sum(root));
    }
}

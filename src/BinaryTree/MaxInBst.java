package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 25-07-2017.
 */
public class MaxInBst {

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

    static int temp = Integer.MIN_VALUE ;
    public static int max(node<Integer> root){
        if (root.data > temp){
            temp = root.data ;
            max(root.right);

        }

        return temp ;
    }
}

package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 28-07-2017.
 */
public class FindNode {
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

    public static boolean isNodePresent(node<Integer> root,int x){
        if (root == null){
            return false;
        }
        if (root.data == x){
            return true;
        }
        return isNodePresent(root.right , x) || isNodePresent(root.left , x);
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(isNodePresent(root ,5));
    }
}

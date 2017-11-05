package BinaryTree;

import Trees.Node;

import java.util.Scanner;

/**
 * Created by Sneha on 25-07-2017.
 */
public class IsBST {

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

    public static boolean isBST(node<Integer> root){

        return isBST(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
    }

    public static boolean isBST(node<Integer> root , int min , int max){
        if (root == null){
            return true ;
        }
        boolean ans = false ;
        if (root.data > min && root.data < max){
             ans = true ;
             ans = isBST(root.left , min , root.data ) && isBST(root.right , root.data , max);
        }
        return ans ;
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(isBST(root));
    }
}

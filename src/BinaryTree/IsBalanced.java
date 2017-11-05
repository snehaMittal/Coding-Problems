package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 28-07-2017.
 */
public class IsBalanced {

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
    public static int height(node<Integer> root){
        int count = 1 ;
        if (root == null){
            return 0 ;
        }
        if (root != null){
            count = count + Math.max(height(root.left) , height(root.right));
        }
        return count ;
    }

    public static boolean checkBalanced(node<Integer> root){

        if (root == null){
            return true;
        }
        if (Math.abs(height(root.left)-height(root.right))<=1 && checkBalanced(root.left) && checkBalanced(root.right))
            return true ;

        return false;
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(checkBalanced(root));
    }
}

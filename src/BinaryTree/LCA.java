package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 01-08-2017.
 */
public class LCA {
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

    public static int lcaInBST(node<Integer> root , int a , int b){
        boolean isA = isPresent(root , a);
        boolean isB = isPresent(root , b);
        if (isA == false && isB == false){
            return -1 ;
        }
        if (isA == true && isB == false){
            return a ;
        }
        if (isA == false && isB == true){
            return b ;
        }
        return lcabst(root , a , b);
    }
    public static boolean isPresent(node<Integer> root , int num){
        if (root == null){
            return false ;
        }
        if (root.data == num){
            return true ;
        }

        return isPresent(root.left , num) || isPresent(root.right , num);
    }
    public static int lcabst(node<Integer> root , int a , int b){
        if (root == null){
            return -1;
        }
        if (root.data == a || root.data == b || (isPresent(root.left , a) && isPresent(root.right , b)) || (isPresent(root.left , b) && isPresent(root.right , a))){
            return root.data ;
        }
        int ans = lcabst(root.left , a , b);
        if (ans == -1){
            ans = lcaInBST(root.right , a, b);
        }
        return ans ;
    }
    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(lcaInBST(root , 7 , 4));
    }
}

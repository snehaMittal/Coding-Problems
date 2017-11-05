package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 03-08-2017.
 */
public class PathSumRootToLeaf {

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

    public static void rootToLeafPathsSumToK(node<Integer> root, int k){
        rootToLeafPathsSumToK(root , k , 0 , "");
    }
    public static void rootToLeafPathsSumToK(node<Integer> root, int k , int sum , String ans){
        if (root == null)
            return;

        sum = sum + root.data ;
        ans = ans + root.data + " ";
        if (sum == k)
            System.out.println(ans);
        rootToLeafPathsSumToK(root.left , k , sum , ans);
        rootToLeafPathsSumToK(root.right , k , sum , ans);
        rootToLeafPathsSumToK(root.left , k , 0 , "");
        rootToLeafPathsSumToK(root.right , k , 0 , "");
    }


    public static void main(String[] args) {
        node<Integer> root = createTree();
        rootToLeafPathsSumToK(root , 15);
    }
}

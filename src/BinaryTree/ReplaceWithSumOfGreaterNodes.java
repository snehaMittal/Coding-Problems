package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 03-08-2017.
 */
public class ReplaceWithSumOfGreaterNodes {

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

    public static void replaceWithLargerNodesSum(node<Integer> root){
        int sum = 0 ;
        replaceWithLargerNodesSum(root , sum);
    }

    public static int replaceWithLargerNodesSum(node<Integer> root , int sum){
        if (root == null){
            return 0 ;
        }
        if (root.right != null) {
            sum = replaceWithLargerNodesSum(root.right , sum);
        }
        root.data = root.data+sum ;
        sum = root.data ;
        if (root.left != null){
            sum = replaceWithLargerNodesSum(root.left , sum);
        }
        return sum ;
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        replaceWithLargerNodesSum(root);
        print(root);
    }
}
//10 3 2 1 -1 -1 -1 7 -1 8 -1 -1 18 16 -1 -1 20 18 -1 -1 -1

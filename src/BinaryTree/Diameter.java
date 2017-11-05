package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 28-07-2017.
 */
public class Diameter {

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

    public static int diameterOfBinaryTree(node<Integer> root){
        if (root == null){
            return 0;
        }
        int leftD = diameterOfBinaryTree(root.left);
        int rightD = diameterOfBinaryTree(root.right);
        int x = height(root.left) + height(root.right)+1 ;

        return Math.max(Math.max(leftD,rightD),x);
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


    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(diameterOfBinaryTree(root));
    }
}


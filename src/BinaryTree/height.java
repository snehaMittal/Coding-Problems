package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sneha on 22-07-2017.
 */
public class height {

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
        print(root);
        System.out.println(height(root));
    }
}

package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 27-07-2017.
 */
public class InsertIntoBST {

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

    public static node<Integer> Insert(node<Integer> root,int value){

        if (root == null){
            node<Integer> newNode = new node<>(value);
            root = newNode ;
            return root ;
        }
        if (root.data > value){
            root.left = Insert(root.left , value);
        }
        else {
            root.right = Insert(root.right , value);
        }
        return root ;
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        root = Insert(root , 6);
        print(root);
    }



















}

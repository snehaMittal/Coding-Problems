package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 07-08-2017.
 */
public class NodesBetK1K2inBST {
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

    public static void printNodeFromK1ToK2(node<Integer> root,int k1,int k2){
        if (k1 > k2){
            print(root , k2 , k1);
        }
        else {
            print(root , k1 , k2);
        }
    }
    public static void print(node<Integer> root , int k1 , int k2){
        if (root == null || root.data<k1 || root.data > k2){
            return;
        }
        if (root.data>=k1 && root.data<=k2){
            print(root.left , k1 , k2);
            System.out.print(root.data + " ");
            print(root.right ,k1 , k2);
        }
        if (root.data< k1 && root.data < k2){
            print(root.right , k1 , k2);
        }
        if (root.data>k1 && root.data>k2){
            print(root.left , k1 , k2);
        }

    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        printNodeFromK1ToK2(root , 500,700);
    }

}
//10 3 2 1 -1 -1 -1 7 -1 8 -1 -1 17 16 -1 -1 20 18 -1 -1 -1
//1229 501 1551 145 627 1382 1677 93 289 569 677 1334 1410 1556 1803 -1 -1 -1 299 -1 -1 -1 1184 -1 -1 -1 1482 -1 1604 -1 1862 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

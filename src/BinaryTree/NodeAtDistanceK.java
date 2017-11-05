package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 04-08-2017.
 */
public class NodeAtDistanceK {

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

    public static void nodesAtDistanceK(node<Integer> root, int node , int k){
        nodesAtDistance_K(root , node , k );
    }
    public static int nodesAtDistance_K(node<Integer> root, int node, int k ){
        if (root == null)
            return -1 ;
        if (root.data == node){
            printNode(root , k);
            return 0;
        }
        int dl = nodesAtDistance_K(root.left , node , k);
        if (dl != -1){
            if (dl + 1 == k){
                System.out.println(root.data);
            }
            else
                printNode(root.right , k-dl-2);
            return 1+dl ;
        }
        int dr = nodesAtDistance_K(root.right , node , k);
        if (dr != -1){
            if (dr+1 == k){
                System.out.println(root.data);
            }
            else
                printNode(root.left , k-dr-2);
            return 1+dr;
        }
        return -1;
    }
    public static void printNode(node<Integer> root , int k){
        if (root == null || k < 0){
            return;
        }
        if (k==0){
            System.out.println(root.data);
            return;
        }
        printNode(root.left , k-1);
        printNode(root.right , k-1);
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        nodesAtDistanceK(root , 8,2);
    }
}
//20 8 4 -1 -1 12 10 -1 -1 14 -1 -1 22 -1 -1
package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 01?>< mnbghjkl;'
 * -07-2017.
 */
public class NodesGreaterThanX {

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
    static int count=0 ;
    public static int numNodesGreaterX(node<Integer> root,int x){
        if (root == null){
            return 0;
        }
        if (root.data > x){
            count++ ;
        }
        numNodesGreaterX(root.left , x);
        numNodesGreaterX(root.right , x);

        return count ;
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(numNodesGreaterX(root,4));
    }

}

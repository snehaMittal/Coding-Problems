package BinaryTree;

import java.util.*;

/**
 * Created by Sneha on 25-07-2017.
 */
public class FormATree {

    static int index=0;
    public static node<Integer> formTree(int[] inOrder , int[] preOrder , int startIndex , int endIndex){

        if (startIndex > endIndex) {
            return null;
        }
        node<Integer> newNode = new node<>(preOrder[index++]);
        int searchedIndex = search(inOrder , preOrder[index-1]);
        newNode.left = formTree(inOrder , preOrder , startIndex , searchedIndex-1 );
        newNode.right = formTree(inOrder , preOrder , searchedIndex+1 , endIndex);

        return newNode ;
    }

    public static int search(int[] arr , int num) {
        for( int i=0 ; i<arr.length ; i++) {
            if ( arr[i] == num) {
                return i ;
            }
        }
        return -1;
    }
    public static void print(node<Integer> root){
        if (root == null){
            return;
        }
        print(root.left);
        System.out.println(root.data);
        print(root.right);
    }

    public static void levelOrder(node<Integer> root) {
        Queue<node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            node<Integer> currentNode = queue.remove();
            if (currentNode == null){
                if (queue.isEmpty())
                    break;
                else {
                    queue.add(null);
                    System.out.println(" ");
                    continue;
                }
            }
            System.out.print(currentNode.data + " ");
            queue.add(currentNode.left);
            queue.add(currentNode.right);
        }
    }
    public static void main(String[] args) {
        int[] pre = {1,2,4,5,3,6,7};
        int[] in = {4,2,5,1,6,3,7};
        node<Integer> root = formTree(in , pre ,0 ,pre.length-1);
        levelOrder(root);
    }
}

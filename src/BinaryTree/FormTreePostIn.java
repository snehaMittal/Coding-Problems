package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sneha on 29-07-2017.
 */
public class FormTreePostIn {
    static int index=0;
    public static node<Integer> formTree(int[] inOrder , int[] postOrder , int startIndex , int endIndex){

        if (startIndex > endIndex || index == postOrder.length-1) {
            return null;
        }
        node<Integer> newNode = new node<>(postOrder[postOrder.length-index-1]);
        int searchedIndex = search(inOrder , postOrder[inOrder.length-1-index]);
        index++ ;
        newNode.left = formTree(inOrder , postOrder , startIndex , searchedIndex-1 );
        newNode.right = formTree(inOrder , postOrder , searchedIndex+1 , endIndex);

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
        int[] post = {4,5,2,6,7,3,1};
        int[] in = {4,2,5,1,6,3,7};
        node<Integer> root = formTree(in , post ,0 ,post.length-1);
        print(root);
    }
}

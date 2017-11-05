package BinaryTree;

import java.util.Scanner;

/**
 * Created by Sneha on 31-07-2017.
 */
public class PairSumBST {
    static Scanner s = new Scanner(System.in);
//8 5 2 -1 -1 6 -1 7 -1 -1 10 -1 -1
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

    public static void nodesSumToS(node<Integer> root, int sum){

        NodeSumToS(root , sum , root);
    }
    public static void NodeSumToS(node<Integer> currentNode , int sum , node<Integer> mainNode){
        if (currentNode == null){
            return;
        }
        int required = sum - currentNode.data;
        find(required ,sum , mainNode);
        NodeSumToS(currentNode.left , sum , mainNode);
        NodeSumToS(currentNode.right , sum , mainNode);
    }
    public static void find(int required ,int sum , node<Integer> root){
        if (root == null){
            return;
        }
        if (required == root.data){
            root.data = Integer.MAX_VALUE;
            if ((sum-required) < required) {
                System.out.println((sum - required) + " " + required);
            }
            else{
                System.out.println(required + " " + (sum-required));
            }
        }
        else if (required < root.data){
            find(required , sum , root.left);
        }
        else {
            find(required , sum , root.right);
        }
    }
    public static void main(String[] args) {
        node<Integer> root = createTree();
        nodesSumToS(root , 15);
    }

}

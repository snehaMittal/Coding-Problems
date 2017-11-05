package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 31-07-2017.
 */
public class InsertDuplicateInBST {
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
    public static void printLevelWise(node<Integer> root){
        Queue<node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            node<Integer> currentNode = queue.remove();
            if (currentNode == null){
                queue.remove();
                if (queue.isEmpty()) {
                    break;
                }
                else {
                    queue.add(null);
                    System.out.println();
                    continue;
                }
            }
            System.out.print(currentNode.data + " ");
            if (currentNode.left != null)
                queue.add(currentNode.left);
            if (currentNode.right != null)
                queue.add(currentNode.right);
        }

    }
    public static void print(node<Integer> root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }

    public static void insertDuplicateNode(node<Integer> root){
        if (root == null){
            return;
        }
        node<Integer> newNode = new node<>(root.data);
        node<Integer> temp = root.left;
        root.left = newNode;
        newNode.left = temp ;
        insertDuplicateNode(temp);
        insertDuplicateNode(root.right);
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        insertDuplicateNode(root);
        print(root);
    }
}
//8 5 2 -1 -1 -1 6 -1 7 -1 -1 10 -1 -1
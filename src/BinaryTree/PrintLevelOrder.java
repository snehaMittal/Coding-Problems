package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 28-07-2017.
 */
public class PrintLevelOrder {

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

    public static void main(String[] args) {
        node<Integer> root = createTree();
        printLevelWise(root);
    }
}
//4 2 9 1 3 5 6 -1 -1 -1 -1 -1 -1 -1 -1
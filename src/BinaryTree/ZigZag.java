package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sneha on 30-07-2017.
 */
public class ZigZag {
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

    public static void printZigZag(node<Integer> root){
        Stack<node<Integer>> stack_even = new Stack<>();
        Stack<node<Integer>> stack_odd = new Stack<>();
        stack_even.push(root);
        while (!stack_even.isEmpty() || !stack_odd.isEmpty()){
            while (!stack_even.isEmpty()){
                node<Integer> current = stack_even.pop();
                System.out.print(current.data + " ");
                if (current.left != null)
                    stack_odd.push(current.left);
                if (current.right != null)
                    stack_odd.push(current.right);
                if (stack_even.isEmpty()){
                    System.out.println("");
                    break;
                }
            }
            while (!stack_odd.isEmpty()){
                node<Integer> current = stack_odd.pop();
                System.out.print(current.data + " ");
                if (current.right != null)
                    stack_even.push(current.right);
                if (current.left != null)
                    stack_even.push(current.left);
                if (stack_odd.isEmpty()){
                    System.out.println("");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        printZigZag(root);
    }
}

package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sneha on 28-07-2017.
 */
public class MaxNode {

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
    static Stack<node<Integer>> stack = new Stack<>();
    public static node<Integer> maxDataNode(node<Integer> root){
        if (root == null){
            return null;
        }
        if (stack.isEmpty()){
            stack.push(root);
        }
        else if (root.data.compareTo(stack.peek().data) > 0){
            stack.pop();
            stack.push(root);
        }
        maxDataNode(root.left);
        maxDataNode(root.right);
        return stack.peek();
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        System.out.println(maxDataNode(root).data);
    }
}

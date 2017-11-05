package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sneha on 25-07-2017.
 */
public class SecondLargestNode {
    static Scanner s = new Scanner(System.in);
    public static Node<Integer> creatTree(){
        int data = s.nextInt();
        Node<Integer> root = new Node<>(data);
        Queue<Node<Integer>> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            Node<Integer> currentNode = queue.remove();
            int noOfChild = s.nextInt();
            for (int i=0 ; i<noOfChild ; i++){
                int childData = s.nextInt();
                Node<Integer> child = new Node<>(childData);
                currentNode.child.add(child);
                queue.add(child);
            }
        }
        return root ;
    }

    public static int largestNode(Node<Integer> root , int max){
        if (root.data > max){
            max = root.data ;
        }

        for (Node<Integer> child : root.child){
            max = largestNode(child , max);
        }
        return max ;
    }
    static Stack<Integer> stack = new Stack<>();
    static Node<Integer> ans = null ;

    public static Node<Integer> findSecondLargest(Node<Integer> root){
        int max = largestNode(root , Integer.MIN_VALUE);
        return findSecondLargest(root , max);
    }

    public static Node<Integer> findSecondLargest(Node<Integer> root , int max){
        if (root.data < max && stack.isEmpty()){
            ans = root ;
            stack.push(root.data);
        }
        else if (root.data < max && root.data > stack.peek()){
            stack.pop();
            ans = root ;
            stack.push(root.data);
        }

        for (int i=0 ; i<root.child.size() ; i++){
            ans = findSecondLargest(root.child.get(i) , max);
        }

        return ans ;
    }

    public static void main(String[] args) {
        Node<Integer> root = creatTree();
        Node<Integer> ans = findSecondLargest(root);
        System.out.println(ans.data);
    }
}

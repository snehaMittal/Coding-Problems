package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sneha on 24-07-2017.
 */
public class NextLargerElement {
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

    static Stack<Integer> stack = new Stack<>();
    static Node<Integer> ans = null ;
    public static Node<Integer> findNextLargerNode(Node<Integer> root, int n){

        if (root.data > n){
            if (stack.isEmpty()){
                stack.push(root.data);
                ans = root ;
            }
            else if (stack.peek() > root.data){
                stack.pop();
                stack.push(root.data);
                ans = root;
            }
        }
        for (int i=0 ; i<root.child.size() ; i++){
            ans = findNextLargerNode(root.child.get(i) , n);
        }
        return ans ;
    }


    public static void main(String[] args) {
        Node<Integer> root = creatTree();
        Node<Integer> ans = findNextLargerNode(root , 60);
        System.out.println(ans.data);
    }

}

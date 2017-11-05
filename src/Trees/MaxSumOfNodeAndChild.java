package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 23-07-2017.
 */
public class MaxSumOfNodeAndChild {
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

    public static Node<Integer> maxSumNode(Node<Integer> root ){
        return maxSumNode(root , Integer.MIN_VALUE , null);
    }
    public static Node<Integer> maxSumNode(Node<Integer> root , int final_ans , Node<Integer> ans){
        int sum = root.data ;
        for (int i=0 ; i<root.child.size() ; i++){
            sum = sum + root.child.get(i).data ;
        }
        if (sum > final_ans){
            final_ans = sum ;
            ans = root ;
        }
        for (int i=0 ; i<root.child.size() ; i++){
            ans = maxSumNode(root.child.get(i) , final_ans , ans);
        }
        return ans ;
    }
    public static void main(String[] args) {
        Node<Integer> root = creatTree();
        Node<Integer> ans = maxSumNode(root);
        System.out.println(ans.data);
    }

}

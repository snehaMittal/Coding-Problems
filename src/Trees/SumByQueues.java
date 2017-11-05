package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 22-07-2017.
 */
public class SumByQueues {

    static Scanner s = new Scanner(System.in);

    public static int sum(){
        int sum = 0 ;
        int data = s.nextInt();
        Node<Integer> root = new Node<>(data);
        Queue<Node<Integer>> queue = new LinkedList<>();

        queue.add(root);

//        sum = sum + root.data ;
        while (!queue.isEmpty()){
            Node<Integer> currentNode = queue.remove();
            sum = sum + currentNode.data;
            int noOfChild = s.nextInt();
            for (int i=0 ; i<noOfChild ; i++){
                int childData = s.nextInt();
                Node<Integer> child = new Node<>(childData);
                currentNode.child.add(child);
                queue.add(child);
            }
        }
        return sum ;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}

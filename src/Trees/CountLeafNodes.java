package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 24-07-2017.
 */
public class CountLeafNodes {
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

    public static int countLeafNodes(Node<Integer> root){

        int count = 0 ;
        if (root.child.size() == 0){
            return count + 1 ;
        }
        for (int i=0 ; i<root.child.size() ; i++){
            count = count + countLeafNodes(root.child.get(i));
        }
        return count ;
    }

    public static void main(String[] args) {
        Node<Integer> root = creatTree();
        System.out.println(countLeafNodes(root));
    }

}

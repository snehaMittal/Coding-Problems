package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 12-08-2017.
 */
public class NodeAtDepthK {
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

    public static void printNodesAtDepthK(Node<Integer> root, int k){
        Queue<Node<Integer>> queue = new LinkedList<>();
        if (k==0){
            System.out.println(root.data);
            return;
        }
        queue.add(root);
        queue.add(null);
        int height=0;

        while (!queue.isEmpty()){
            Node<Integer> currentNode = queue.remove();
            if (currentNode == null) {
                height++;
                queue.add(null);
                if (height == k) {
                    while (!queue.isEmpty() && queue.peek()!=null) {
                        System.out.println(queue.remove().data + " ");
                    }
                    return;
                }
                continue;
            }
            for (int i=0 ; i<currentNode.child.size() ; i++){
                queue.add(currentNode.child.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = creatTree();
        printNodesAtDepthK(root ,2);
    }
}

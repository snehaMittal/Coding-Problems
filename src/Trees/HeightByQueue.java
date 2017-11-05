package Trees;

import BinaryTree.node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 22-07-2017.
 */
public class HeightByQueue {

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

    public static <T>int height(Node<T> root){

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count =1;
        while (!queue.isEmpty()) {
            Node<T> currentNode = queue.remove();
            if(currentNode==null&&!queue.isEmpty()){
                count++;
                queue.add(null);
                continue;
            }
            if (queue.isEmpty())
                break;

            for (int i = 0; i < currentNode.child.size(); i++) {
                queue.add(currentNode.child.get(i));
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Node<Integer> root = creatTree();
        System.out.println(height(root));
    }
}

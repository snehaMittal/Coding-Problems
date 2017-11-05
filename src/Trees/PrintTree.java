package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 20-07-2017.
 */
public class PrintTree {
    static Scanner s = new Scanner(System.in);

    public static  Node<Integer> prepareTree(){
        int data = s.nextInt() ;
        Node<Integer> root = new Node<>(data);
        int size = s.nextInt();

        for (int i=0 ; i<size ; i++){
            root.child.add(prepareTree());
        }
        return root ;
    }

    public static void printTrees(Node<Integer> root){

        System.out.print(root.data + " : " );
        for (int i=0 ; i<root.child.size() ; i++){
            System.out.println(root.child.get(i).data + " ");
            printTrees(root.child.get(i));
        }
        return;
    }
    public static void printLevelwise(Node<Integer> root){
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node<Integer> currentNode = queue.remove();
            if (currentNode == null){
                if (queue.isEmpty()){
                    break;
                }else {
                    queue.add(null);
                    System.out.println("");
                    continue;
                }
            }
            System.out.print(currentNode.data + " ");
            for (int i=0 ; i<currentNode.child.size() ; i++){
                queue.add(currentNode.child.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = prepareTree();
        printLevelwise(root);
    }
}

package Trees;

import java.util.*;

/**
 * Created by Sneha on 22-07-2017.
 */
public class PrepareTreeByQueue {

   static Scanner s = new Scanner(System.in);

   public static Node<Integer> prepareTree(){
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
    public static void print(Node<Integer> root){
        System.out.println(root.data);
        for (int i=0 ; i<root.child.size() ; i++){
            System.out.println(root.child.get(i));
        }
    }

    public static void printTrees(Node<Integer> root){

        System.out.print(root.data );
        for (int i=0 ; i<root.child.size() ; i++){
            System.out.println(root.child.get(i).data+ " ");
            printTrees(root.child.get(i));
        }
        return;
    }

    public static void main(String[] args) {
        Node<Integer> root = prepareTree();
        printTrees(root);
    }
}

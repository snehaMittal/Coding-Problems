package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 24-07-2017.
 */
public class ReplaceNodeWithDepth {
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


    public static void replaceWithDepthValue(Node<Integer> root){

        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        root.data = 0 ;
        int count=1 ;
        while (!queue.isEmpty()) {
            Node<Integer> currentNode = queue.remove();
            if(currentNode==null&&!queue.isEmpty()){
                count++;
                queue.add(null);
                continue;
            }
            if (queue.isEmpty())
                break;

            for (int i = 0; i < currentNode.child.size(); i++) {
                currentNode.child.get(i).data = count ;
                queue.add(currentNode.child.get(i));
            }
        }

    }

    public static void printTrees(Node<Integer> root){

        System.out.print(root.data + " " );
        for (int i=0 ; i<root.child.size() ; i++){
            printTrees(root.child.get(i));
        }
        return;
    }


    public static void main(String[] args) {
        Node<Integer> root = creatTree();
        replaceWithDepthValue(root);
        printTrees(root);

    }

}

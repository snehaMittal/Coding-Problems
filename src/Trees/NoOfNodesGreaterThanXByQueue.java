package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 22-07-2017.
 */
public class NoOfNodesGreaterThanXByQueue {

    public static int numNodeGreater(Node<Integer> root,int x){
        int count = 0 ;
        if (root.data > x){
            count = count + 1 ;
        }
        for (int i=0 ; i<root.child.size() ; i++){
            count = count + numNodeGreater(root.child.get(i) , x);
        }
        return count ;
    }

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

    public static void main(String[] args) {
        Node<Integer> root = creatTree();
        System.out.println(numNodeGreater(root,10));
    }
}

package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 23-07-2017.
 */
public class ContainX {

    public static boolean checkIfContainsX(Node<Integer> root, int x){
        Boolean ans = false ;

        if (root.data == x)
            return true ;

        for (int i=0 ; i<root.child.size() ; i++){
            ans = checkIfContainsX(root.child.get(i) , x);
            if (ans == true){
                return true ;
            }
        }

        return ans ;

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
        System.out.println(checkIfContainsX(root , 60));
    }
}

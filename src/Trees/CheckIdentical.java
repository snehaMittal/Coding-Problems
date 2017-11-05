package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 23-07-2017.
 */
public class CheckIdentical {static Scanner s = new Scanner(System.in);

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

    public static boolean checkIdentical(Node<Integer> root1, Node<Integer> root2){

        if (root1 == null && root2 == null){
            return true ;
        }
        if (root1 != null && root2 != null){
            if (root1.child.size() != root2.child.size())
                return false ;
            else {
                for (int i=0 ; i<root1.child.size() && i<root2.child.size() ; i++){
                    boolean ans = (root1.data==root2.data && checkIdentical(root1.child.get(i) , root2.child.get(i)));
                    if (ans == false)
                        return false ;
                }
                return true ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        Node<Integer> root1 = creatTree() ;
        Node<Integer> roor2 = creatTree() ;
        System.out.println(checkIdentical(root1 , roor2));

    }

}

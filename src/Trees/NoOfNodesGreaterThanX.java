package Trees;

import java.util.Scanner;

/**
 * Created by Sneha on 20-07-2017.
 */
public class NoOfNodesGreaterThanX {
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
    public static int numOfNodes(Node root , int x){
        return numOfNodes(root , x , 0);
    }

    public static int numOfNodes(Node<Integer> root , int x , int count){
        if (root.data > x){
            count = count + 1 ;
        }

        for (Node<Integer> child : root.child){
            count = numOfNodes(child , x , count);
        }
        return count ;
    }

    public static void main(String[] args) {
        Node root = prepareTree();
        System.out.println(numOfNodes(root , 3 ));
    }
}

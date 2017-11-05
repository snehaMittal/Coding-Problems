package Trees;

import java.util.Scanner;

/**
 * Created by Sneha on 20-07-2017.
 */
public class LargestNode {

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

    public static int largestNode(Node root){
        int min = Integer.MIN_VALUE ;
        return largestNode(root , min);
    }

    public static int largestNode(Node<Integer> root , int max){
        if (root.data > max){
            max = root.data ;
        }

        for (Node<Integer> child : root.child){
            max = largestNode(child , max);
        }
        return max ;
    }

    public static void main(String[] args) {
        Node root = prepareTree();
        System.out.println(largestNode(root));
    }

}

package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Sneha on 20-07-2017.
 */
public class HeightOfATree {

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

    public static int height(Node<Integer> root){

        return 0 ;
    }

    public static void main(String[] args) {
        Node root = prepareTree();
        System.out.println(height(root));
    }
}

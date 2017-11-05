package Trees;

import java.util.Scanner;

/**
 * Created by Sneha on 20-07-2017.
 */
public class CountNodes {

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

    public static int count(Node root){

       return count(root , 0);
    }

    public static int count(Node<Integer> root , int count){

        count = count + 1 ;
        for (Node<Integer> child : root.child){
            count = count + count(child , count);
        }
        return count ;
    }

    public static void main(String[] args) {
        Node root = prepareTree();
        System.out.println(count(root));
    }
}

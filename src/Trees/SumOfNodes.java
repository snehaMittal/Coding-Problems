package Trees;

import java.util.Scanner;

/**
 * Created by Sneha on 20-07-2017.
 */
public class SumOfNodes {

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

    public static int sumOfNodes(Node root){

        return sumOfNodes(root , 0);
    }

    public static int sumOfNodes(Node<Integer> root , int sum){
        sum = sum + root.data ;
        for (Node<Integer> child : root.child){
            sum = sumOfNodes(child , sum);
        }
        return sum ;
    }

    public static void main(String[] args) {
        Node root = prepareTree();
        System.out.println(sumOfNodes(root));
    }


}

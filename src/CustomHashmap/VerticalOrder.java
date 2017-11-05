package CustomHashmap;

import BinaryTree.node;

import java.util.*;

/**
 * Created by Sneha on 12-08-2017.
 */
public class VerticalOrder {
    static Scanner s = new Scanner(System.in);

    public static node<Integer> createTree(){
        int data = s.nextInt();
        if (data == -1){
            return null ;
        }
        node<Integer> root = new node<>(data);
        root.left = createTree();
        root.right = createTree();
        return root ;
    }
    static void getVerticalOrder(node<Integer> root, int hd, TreeMap<Integer,ArrayList<Integer>> m) {
        if(root == null)
            return;
        ArrayList<Integer> get =  m.get(hd);
        if(get == null) {
            get = new ArrayList<>();
            get.add(root.data);
        }
        else
            get.add(root.data);
        m.put(hd, get);
        getVerticalOrder(root.left, hd-1, m);
        getVerticalOrder(root.right, hd+1, m);
    }
    public static void printBinaryTreeVerticalOrder(node<Integer> root){
        TreeMap<Integer , ArrayList<Integer>> map = new TreeMap<>();
        getVerticalOrder(root ,0 ,map);
        for (Map.Entry<Integer , ArrayList<Integer>> x : map.entrySet()){
            for (Integer y : x.getValue()){
                System.out.print(y + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        printBinaryTreeVerticalOrder(root);
    }
}
//10 8 4 -1 -1 9 -1 -1 15 13 -1 -1 12 -1 -1

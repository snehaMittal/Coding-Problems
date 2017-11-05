package BinaryTree;

import Trees.Node;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sneha on 12-08-2017.
 */
public class BSTtoLLL {
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

    static ArrayList<node<Integer>> answer = new ArrayList<>();
    public static MyLinkedList.Node<Integer> BSTToSortedLL(node<Integer> root){
        formArray(root);
        MyLinkedList.Node<Integer> head = null ;
        MyLinkedList.Node<Integer> temp = null ;
        for (node<Integer> x : answer){
            MyLinkedList.Node<Integer> newnode = new MyLinkedList.Node<>(x.data);
            if (head == null){
                head = newnode;
                temp = head ;
            }
            else {
                temp.next = newnode;
                temp = temp.next ;
            }
        }
        return head ;
    }

    public static void  formArray(node<Integer> root){
        if (root == null)
            return ;
        formArray(root.left);
        answer.add(root);
        formArray(root.right);
        return  ;
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        BSTToSortedLL(root);
    }
}

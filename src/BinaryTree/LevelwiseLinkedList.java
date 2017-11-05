package BinaryTree;

import MyLinkedList.Node;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Sneha on 29-07-2017.
 */
public class LevelwiseLinkedList {
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
//8 5 2 -1 -1 6 -1 7 -1 -1 10 -1 -1
    public static ArrayList<Node<node<Integer>>> LLForEachLevel(node<Integer> root){
        Queue<node<Integer>> queue = new LinkedList<>();
        ArrayList<Node<node<Integer>>> ans = new ArrayList<>();
        queue.add(root);
        queue.add(new node<>(Integer.MAX_VALUE));

        Node<node<Integer>> head = new Node<>(queue.remove());
        if (root.left != null)
            queue.add(root.left);
        if (root.right != null)
            queue.add(root.right);
        Node<node<Integer>> temp = head ;

        while (!queue.isEmpty()){
            node<Integer> currentNode = queue.remove();
            Node<node<Integer>> newNode = new Node<>(currentNode);

            if (currentNode.data == Integer.MAX_VALUE){
                currentNode = new node<>(Integer.MAX_VALUE);
                if (queue.isEmpty()){
                    break;
                }else{
                    queue.add(currentNode);
                    temp.next = newNode ;
                    temp = temp.next;
                    continue;
                }
            }
            temp.next = newNode ;
            temp = temp.next;
            if (currentNode.left != null)
                queue.add(currentNode.left);
            if (currentNode.right != null)
                queue.add(currentNode.right);
        }
        ans = addToList(ans , head);
        return ans ;
    }
    public static ArrayList<Node<node<Integer>>> addToList(ArrayList<Node<node<Integer>>> ans , Node<node<Integer>> head){

        if (head == null){
            return ans ;
        }
        Node<node<Integer>> newTemp=null;
       Node<node<Integer>> temp=head ;
        while (temp.next != null && temp.next.data.data != Integer.MAX_VALUE ){
            temp = temp.next;

        }
        if (temp.next != null) {
            newTemp = temp.next.next;
        }
        temp.next = null ;
        ans.add(head);
        addToList(ans , newTemp);
        return ans;
    }

    public static void print_recurssion(Node<node<Integer>>head)
    {
        if (head == null)
        {
            return;
        }
        System.out.print(head.data.data+" ");
        print_recurssion(head.next);
    }

    public static void main(String[] args) {
        node<Integer> root = createTree();
        ArrayList<Node<node<Integer>>> ans = LLForEachLevel(root);
        for (Node<node<Integer>> head : ans){
            print_recurssion(head);
        }
    }
}

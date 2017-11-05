package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class DeleteNodeRecursively {

    public static Node create_list()
    {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node head = null ;
        Node temp = null;

        while( data != -1)
        {
            Node newNode = new Node(data);

            if (head == null)
            {
                head = newNode;
                temp = newNode;
            }
            else
            {
                temp.next = newNode;
                temp = temp.next;
            }

            data = s.nextInt() ;
        }
        return head ;
    }

    public static void print_recurssion(Node head)
    {
        if (head == null)
        {
            return;
        }
        System.out.print(head.data+" ");
        print_recurssion(head.next);
    }

    public static Node<Integer> deleteIthNodeRec(Node<Integer> head, int i){
        return deleteIthNodeRec(head , i , 1 , head);
    }

    public static Node<Integer> deleteIthNodeRec(Node<Integer> head, int i , int count , Node<Integer> temp){
        if (i == 0)
        {
            return head.next;
        }
        if (temp.next == null)
        {
            return head;
        }
        if (count == i)
        {
            temp.next = temp.next.next;
            return head;
        }

        return deleteIthNodeRec(head , i , count+1 , temp.next);
    }

    public static void main(String[] args) {
        Node head = create_list();
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        head = deleteIthNodeRec(head , i);
        print_recurssion(head);
    }
}

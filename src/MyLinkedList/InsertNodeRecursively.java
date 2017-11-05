package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class InsertNodeRecursively {
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
    public static Node<Integer> insertR(Node<Integer> head, int data, int pos){
        return insertR(head , data , pos , 1 , head);
    }

    public static Node<Integer> insertR(Node<Integer> head, int data, int pos , int count , Node<Integer> temp){

        if (pos == 0)
        {
            Node newNode = new Node(data);
            newNode.next = temp;
            return newNode ;
        }
        if ( pos == count)
        {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            return head ;
        }
        if (temp.next == null)
        {
            return head ;
        }
        return insertR(head , data , pos , count+1 , temp.next);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node head = create_list();
        int data = s.nextInt();
        int pos = s.nextInt();
        head = insertR(head , data , pos);
        print_recurssion(head);

    }
}

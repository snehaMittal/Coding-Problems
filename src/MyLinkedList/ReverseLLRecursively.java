package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class ReverseLLRecursively {
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

    public static Node<Integer> reverse_R(Node<Integer> head){
        Node newNode ;
        if( head.next == null)
        {
            return head;
        }
        newNode = reverse_R(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }


//    public static Node<Integer> reverse_R(Node<Integer> head , Node<Integer> temp  ){
//
//        Node forward = temp.next;
//        temp.next = head ;
//        head = temp ;
//        temp = forward ;
//        if (temp.next == null)
//        {
//            return head ;
//        }
//        return reverse_R(head , temp);
//    }

    public static void main(String[] args) {
        Node head = create_list();
        print_recurssion(head);
        head = reverse_R(head);
        print_recurssion(head);
    }
}

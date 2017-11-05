package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class ReverseLLiteratively {
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


    public static Node<Integer> reverse_I(Node<Integer> head){
        Node temp = head ;
        Node prev = null;
        Node forward = null ;

        while (temp != null){
            forward = temp.next;
            temp.next = prev;
            prev = temp ;
            temp = forward;
        }
        head = prev ;
        return head;
    }

    public static void main(String[] args) {
        Node head = create_list();
        print_recurssion(head);
        head = reverse_I(head);
        print_recurssion(head);
    }
}

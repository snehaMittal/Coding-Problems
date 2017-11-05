package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class EleminateDuplictes {
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


    public static Node<Integer> removeDuplicates(Node<Integer> head){
        Node temp = head ;
         while (temp.next != null){
             if (temp.data.equals(temp.next.data)){
                 temp.next = temp.next.next ;
                 continue;
             }
             temp = temp.next;
         }
         return head;
    }

    public static void main(String[] args) {
        Node head = create_list();
        head = removeDuplicates(head);
        print_recurssion(head);
    }
}

package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 13-07-2017.
 */
public class InsertNode {
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


    public static Node<Integer> insert(Node<Integer> head, int data, int pos){
        Node newnode = new Node(data);
        if (pos == 0)
        {
            newnode.next = head;
            return newnode;
        }
        int count=1;
        Node temp = head;
        while(count != pos || temp == null)
        {
            count++;
            if (temp.next == null)
                return head;
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode ;
        return head;

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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node head = create_list();
        int pos = s.nextInt();
        int data = s.nextInt();
        head = insert(head , data , pos);
        print_recurssion(head);
    }

}

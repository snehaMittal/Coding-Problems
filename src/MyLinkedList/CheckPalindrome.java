package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class CheckPalindrome {
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

    public static boolean isPalindrome_2(Node<Integer> head){
        Node temp ;
        Node prev = null;
        while (head.next != null ) {
            temp = head ;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next ;
            }
            if (temp.data == head.data)
            {
                prev.next = null;
            }
            else {
                return false;
            }
            if (head.next != null){
                head=head.next;
            }
            else
                break;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = create_list();
        System.out.println(isPalindrome_2(head));
    }
}

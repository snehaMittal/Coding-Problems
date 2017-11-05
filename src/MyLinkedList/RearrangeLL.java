package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 16-07-2017.
 */
public class RearrangeLL {
    public static Node create_list() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node head = null ;
        Node temp = null;

        while( data != -1) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                temp = newNode;
            }
            else {
                temp.next = newNode;
                temp = temp.next;
            }

            data = s.nextInt() ;
        }
        return head ;
    }
    public static void print_recurssion(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data+" ");
        print_recurssion(head.next);
    }
    public static int length(Node<Integer> head , int count) {
        if (head.next == null)
        {
            return count+1 ;
        }

        return length(head.next , count+1) ;
    }

    public static Node<Integer> changelist(Node<Integer> head){
        Node temp , head1=null , temp1=head , pre=null , temp2=null;
        int count = length(head , 0);
        if (count == 0 || count == 1 || count == 2){
            return head;
        }
        while (head.next != null && head != null){

            temp2=head.next;
            temp = head ;
            while (temp.next != null){
                pre = temp ;
                temp = temp.next ;
            }
            if ( head1 == null){
                head1 = head ;
                head1.next = temp;
                temp1 = temp ;
                pre.next = null;
            }
            else{
                temp1.next = head;
                temp1.next.next = temp;
                temp1 = temp ;
                if (pre == head){
                    return head1;
                }
                pre.next = null ;
            }

            head = temp2;
        }

            temp1.next = head ;

        return head1 ;
    }

    public static void main(String[] args) {
        Node head = create_list();
        head = changelist(head);
        print_recurssion(head);
    }
}

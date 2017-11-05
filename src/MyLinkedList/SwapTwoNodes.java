package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 14-07-2017.
 */
public class SwapTwoNodes {
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

    public static  Node<Integer> swap_nodes(Node<Integer> head,int i,int j){
        if (i == j)
            return head;


        int count = 1;
        Node prev1=null , prev2=null , temp=head ;
        Node temp1=null , temp2=null , forward1 = null , forward=null;
        if (i == 0 || j == 0){
            temp1 = head;
            count++;
            temp = temp.next;

            if (i==1 || j==1){
                temp2 = temp;
                forward = temp2.next;
                head = temp2;
                temp2.next = temp1 ;
                temp1.next = forward;
                return head;
            }
            while (temp.next != null && temp != null)
            {
                if (count == i || count == j){
                    temp2 = temp;
                    break;
                }
                count++;
                temp = temp.next;
            }
            if ( temp2 == null){
                return head;
            }

            temp2 = prev2.next;
            forward1 = temp1.next;
            forward = temp2.next;

            if ((i-j) == 1 || (j-i) == 1){
                head = temp2;
                temp2.next = temp1;
                temp1.next = forward;
            }
            else {
                head = temp2;
                temp2.next = forward1;
                prev2.next = temp1;
                temp1.next = forward;
            }
        }
        else {
            while (temp.next != null){
                if (count == i || count == j){
                    prev1 = temp;
                    count++;
                    temp = temp.next;
                    break;
                }
                count++;
                temp = temp.next;
            }
            while (temp.next != null && temp != null)
            {
                if (count == i || count == j){
                    prev2 = temp;
                    break;
                }
                count++;
                temp = temp.next;
            }
            if (prev1 == null || prev2 == null){
                return head;
            }
            temp1 = prev1.next;
            temp2 = prev2.next;
            forward1 = temp1.next;
            forward = temp2.next;

            if ((i-j) == 1 || (j-i) == 1){
                prev1.next = temp2;
                temp2.next = temp1;
                temp1.next = forward;
            }
            else {
                prev1.next = temp2;
                prev2.next = temp1;
                temp1.next = forward;
                temp2.next = forward1;
            }
        }
        return head;

    }
    public static void main(String[] args) {
        Node head = create_list();
        int i=2 , j=3;
        head = swap_nodes(head , i , j);
        print_recurssion(head);
    }
}

package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 17-07-2017.
 */
public class BubbleSort {
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
    public static int length(Node<Integer> head)
    {
        int count=0 ;
        while(head != null)
        {
            head = head.next;
            count++ ;
        }
        return count ;

    }
    public static Node<Integer> bubbleSort(Node<Integer> head ){
        int count = length(head);
        int i , flag=0;
        Node<Integer> mainHead=head ;
        for (i=1 ; i<count ; i++){
            Node<Integer> temp = mainHead ;
            for (int j=0 ; j < count-i ; j++){
                flag = 0 ;
                if (temp.data.compareTo(temp.next.data) > 0){
                    mainHead = swap_nodes(mainHead , j , j+1);
//                    print_recurssion(mainHead);
//                    System.out.println(" ");
//                    System.out.println(temp.data);
//                    System.out.println(" ");
                    flag = 1 ;
                }
                if (flag == 0) {
                    temp = temp.next;
                }
            }
        }
        return mainHead ;
    }

    public static void main(String[] args) {
        Node head = create_list();
        head = bubbleSort(head) ;
        print_recurssion(head);
    }
}

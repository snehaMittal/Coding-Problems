package MyLinkedList;

import java.util.Scanner;

/**
 * Created by Sneha on 18-07-2017.
 */
public class DeleteNNodes {
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

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N){

        Node current = head , temp=null ;
        while (current != null){
            for (int i=1 ; i<M && current!=null ; i++){
                current = current.next;
            }
            if (current == null || current.next == null){
                return head ;
            }
            temp = current.next;
            for (int i=1 ; i<N && temp.next!=null ; i++){
                temp = temp.next;
            }
            current.next = temp.next ;
            current = temp.next ;
        }
        return head ;
    }

    public static void main(String[] args) {
        Node head = create_list();
        head = skipMdeleteN(head , 2,3);
        print_recurssion(head);
    }
}

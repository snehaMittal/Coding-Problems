package Trees;


import Queues.*;

/**
 * Created by Sneha on 19-07-2017.
 */
public class Queues_LL<T> {
    Node_Queue<Integer> front=null ;
    Node_Queue<Integer> rear=null  ;
    int size ;

    public Queues_LL(){
        front = rear = null ;
        size = 0 ;
    }

    public Node_Queue<Integer> enqueue(int data) {
        if (front == null){
            Node_Queue<Integer> newNode = new Node_Queue<>(data);
            front = newNode ;
            rear = newNode ;
            return front ;
        }

        Node_Queue<Integer> newNode = new Node_Queue<>(data);
        rear.next = newNode ;
        return front ;
    }

    public int dequeue(){
        if (front == null){
            throw new NullPointerException();
        }

        Node_Queue<Integer> temp = front ;
        front = front.next ;
        return temp.data ;
    }

    public int peek(){

        return front.data;
    }

    public boolean isEmplty(){
        if (front == null || rear == null)
            return true ;

        return false ;
    }
}

package Queues;

import Stacks.node;

/**
 * Created by Sneha on 19-07-2017.
 */
public class Node<T> {
    T data ;
   public  Node<T> next ;

    public Node(T data){
        this.data = data ;
        next = null ;
    }
}

package Trees;

import Queues.*;

/**
 * Created by Sneha on 22-07-2017.
 */
public class Node_Queue<T> {
    T data ;
    public Node_Queue<T> next ;

    public Node_Queue(T data){
        this.data = data ;
        next = null ;
    }
}

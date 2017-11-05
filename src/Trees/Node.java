package Trees;

import java.util.ArrayList;

/**
 * Created by Sneha on 20-07-2017.
 */
public class Node<T> {
    T data ;
    ArrayList<Node<T>> child ;

    public Node(T data){
        this.data = data ;
        child = new ArrayList<>();
    }
}

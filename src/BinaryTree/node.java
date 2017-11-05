package BinaryTree;

/**
 * Created by Sneha on 22-07-2017.
 */
public class node<T> {
    public T data ;
    public node<T> left ;
    public node<T> right ;

    public node(T data){
        this.data = data;
        left = null ;
        right = null ;
    }
}

package Stacks;

/**
 * Created by Sneha on 19-07-2017.
 */


public class Stacks_LL<T> {

    private node<T> top=null ;

    public node<T> push(T data){

        if (top == null){
            node newNode = new node(data) ;
            top = newNode ;
            return top ;
        }

        node newNode = new node(data);
        newNode.next = top ;
        top = newNode ;

        return top ;
    }

    public T pop() throws StackOverflowError {

        if (top == null){
            throw new StackOverflowError();
        }

        T temp ;
        temp = top.data ;
        top = top.next ;
        return temp ;
    }

    public T peek(){
        return top.data ;
    }

    public boolean isEmpty(){
        if (top == null)
            return true ;

        return false ;
    }

    public int size(node top) {
        int count=0 ;
        while(top != null) {
            top = top.next;
            count++ ;
        }

        return count ;
    }


}

package Stacks;

/**
 * Created by Sneha on 19-07-2017.
 */
public class Stacks {
    private int[] stackArray ;
    private int top ;
    private int size ;

    public Stacks() {
        top = -1;
        stackArray = new int[10];
    }

    public Stacks(int size){
        this.size = size ;
        top = -1 ;
        stackArray = new int[size];
    }

    public void push(int data) throws StackOverflowError {

        if (top == size-1){
            throw new StackOverflowError() ;
        }
        stackArray[++top] = data ;
    }

    public int pop() throws NullPointerException {

         if (top == -1){
             throw new NullPointerException() ;
         }
         int temp = stackArray[top-1] ;
         return temp ;
    }

    public boolean isEmpty() {
        if (top == -1)
            return true ;

        return false ;
    }

    public boolean ifFull() {
        if (top == stackArray.length -1)
            return true ;

        return false ;
    }

    public int peek() throws NullPointerException {
        if (top == -1){
            throw new NullPointerException() ;
        }

        return stackArray[top];
    }

    public int size() {
        return size ;
    }
}

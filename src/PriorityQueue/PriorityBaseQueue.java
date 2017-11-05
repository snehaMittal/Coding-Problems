package PriorityQueue;

import java.util.ArrayList;

/**
 * Created by Sneha on 02-08-2017.
 */
public abstract class PriorityBaseQueue<T> {
    ArrayList<PriorityNode<T>> heap ;
    final static int MAX_Size = 10 ;

    PriorityBaseQueue(){
        this.heap = new ArrayList<>();
    }

    public void add(T data , int priority){
        PriorityNode<T> newNode = new PriorityNode<>(data , priority);
        heap.add(newNode);
        shiftup( size());
    }
    public T remove(){
        T data = heap.get(0).data;
        heap.set(0 , heap.get(size()));
        heap.remove(0);
        shiftdown(0);
        return data ;
    }
    int size(){
        return heap.size()-1;
    }
    int getLeftIndex(int index){
        int leftIndex = 2*index+1;
        if(leftIndex>size()){
            return -1;
        }
        return leftIndex;
    }
    int getRightIndex(int index){
        int rightIndex = 2*index+2;
        if(rightIndex>size()){
            return -1;
        }
        return rightIndex;
    }
    void swap(int index, int highestPriority) {
        PriorityNode<T> node = heap.get(index);
        heap.set(index, heap.get(highestPriority));
        heap.set(highestPriority, node);
    }
    int getParentIndex(int index){
        return (index-1)/2;
    }
    public abstract void shiftup(int index);
    public abstract void shiftdown(int index);


}

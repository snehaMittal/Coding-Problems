package PriorityQueue;

/**
 * Created by Sneha on 02-08-2017.
 */
public class MinPriorityQueue<T> extends PriorityBaseQueue<T> {
    public void shiftup(int index){
        int parentIndex = getParentIndex(index);
        if (index != -1 && heap.get(parentIndex).priority < heap.get(index).priority){
            swap(parentIndex , index);
            shiftup(parentIndex);
        }
    }

    public void shiftdown(int index){
        int leftIndex = getLeftIndex(index);
        int rightIndex = getRightIndex(index);
        int highestPriority = -1 ;

        if (leftIndex != -1 && rightIndex != -1){
            if (heap.get(leftIndex).priority < heap.get(rightIndex).priority){
                highestPriority = leftIndex ;
            }
            else {
                highestPriority = rightIndex ;
            }
        }
        if (leftIndex != -1){
            highestPriority = leftIndex ;
        }
        if (highestPriority != -1){
            if (heap.get(highestPriority).priority < heap.get(index).priority){
                swap(highestPriority , index);
                shiftdown(highestPriority);
            }
        }

    }
}

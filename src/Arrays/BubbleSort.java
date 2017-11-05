package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 13-06-2017.
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        int temp , flag=1 , count =0;

        for( int i=0 ; i<arr.length ; i++)
        {
            flag = 1 ;
            for( int j=0 ; j<(arr.length-1) ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 0;
                    count++;
                }

            }
            if(flag == 1)
            {
                break ;
            }
        }
        System.out.println("\n");
        System.out.println(count);


        System.out.println("Array after sorting");
        for( int j=0 ; j<arr.length ; j++)
        {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] arr = {7,6,5,4,3,2,1};
        int[] arr1={1,2,3,4,5,6,7};
        int[] arr2={7,6,5,4,1,2,3};
        bubbleSort(arr);
        bubbleSort(arr1);
        bubbleSort(arr2);
    }

}

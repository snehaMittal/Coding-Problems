package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques10 {

    public static void bubbleSort(int[] arr)
    {
        int temp ;

        for( int i=0 ; i<arr.length ; i++)
        {
            for( int j=0 ; j<(arr.length-1) ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }
        }
        System.out.println("Array after sorting");
        for( int j=0 ; j<arr.length ; j++)
        {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];

        for( int i=0 ; i< n ; i++)
        {
            arr[i] = s.nextInt();
        }

        System.out.println("Entered Array:");
        System.out.println(" ");
        for( int i=0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        bubbleSort(arr);

    }
}

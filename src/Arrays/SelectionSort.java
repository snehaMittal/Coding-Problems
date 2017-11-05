package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 13-06-2017.
 */
public class SelectionSort {

    public static void selectionSort(int[] arr)
    {
        int c;
        for ( int i=0 ; i<arr.length ; i++)
        {
            int min = arr[i] ;
            c = i ;
            for(int j=i ; j<arr.length ; j++)
            {
                if (min > arr[j])
                {
                    min = arr[j];
                    c = j ;
                }
            }
            int temp = arr[i] ;
            arr[i] = arr[c];
            arr[c] = temp ;
        }
        for( int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
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
        selectionSort( arr);


    }
}

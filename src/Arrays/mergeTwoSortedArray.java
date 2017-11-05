package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 18-06-2017.
 */
public class mergeTwoSortedArray {

    public static int[] merge(int arr1[], int arr2[])
    {
        int[] arr = new int[arr1.length + arr2.length];
        int i=0 , j=0 , k=0;

        while( k < (arr1.length + arr2.length))
        {
            if ( i == arr1.length)
            {
                i = -1 ;
                break;
            }
            else if( j == arr2.length)
            {
                j = -1;
                break ;
            }

             else if(arr1[i] < arr2[j])
            {
                arr[k] = arr1[i];
                k++ ;
                i++ ;
            }
            else if (arr2[j] < arr1[i])
            {
                arr[k] = arr2[j];
                k++ ;
                j++ ;
            }
            else
            {
                arr[k] = arr1[i];
                arr[k+1] = arr2[j];
                i++ ;
                j++ ;
                k = k + 2 ;
            }

        }
        if( i == -1)
        {
            while( j < arr2.length)
            {
                arr[k] = arr2[j];
                k++ ;
                j++ ;
            }
        }
        if( j == -1)
        {
            while( i < arr1.length)
            {
                System.out.println(arr1[i]);
                arr[k] = arr1[i];
                k++ ;
                i++ ;
            }
        }


        return arr;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0 ; i<n1 ; i++)
        {
            arr1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0 ; i<n2 ; i++)
        {
            arr2[i] = s.nextInt();
        }

        int[] arr3 = merge(arr1,arr2);
        for (int i=0 ; i<(n1+n2) ; i++)
        {
            System.out.print(arr3[i] + " ");
        }
    }

}

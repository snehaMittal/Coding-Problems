package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 05-07-2017.
 */
public class quickSort {

    public static void quickSort(int[] input)
    {
        int start = 0 ;
        int end = input.length-1 ;
        quick_Sort(input , start , end);

    }

    public static void quick_Sort(int[] input , int start , int end)
    {
        if (start>=end)
            return;
        int position = getPosition(input , start , end);
        quick_Sort(input , start , position-1);
        quick_Sort(input , position+1 , end);
    }

    public static int getPosition(int[] input , int start , int end)
    {
        int x = input[start];
        int i = end+1 ;
        int j ;
        for (j = end ; j>start ; j--)
        {
            if (input[j] >= x)
            {
                i-- ;
                int temp = input[i] ;
                input[i] = input[j] ;
                input[j] = temp ;
            }
        }
        i-- ;
        int temp = input[i];
        input[i] = input[start];
        input[start] = temp;
        return i ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        quickSort(arr);
        for (int i =0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}

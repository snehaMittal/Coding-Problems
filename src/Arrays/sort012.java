package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 18-06-2017.
 */
public class sort012 {
    public static void sort( int[] arr)
    {
        int beg=0 , end=arr.length-1 ;
        for (int i=0 ; i<end ; i++)
        {
            if (arr[i] == 0)
            {
                int temp = arr[beg];
                arr[beg] = arr[i];
                arr[i] = temp;
                beg++ ;
            }
            else
            {
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end -- ;
                i -- ;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        sort(arr);
        for (int i=0 ; i<n ; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}

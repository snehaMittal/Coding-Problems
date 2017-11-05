package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 13-06-2017.
 */
public class LargestElementInArray {

    public static int largestElement(int[] arr)
    {
        int max = arr[0];
        for(int i=0 ; i<arr.length ; i++)
        {
            if( max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        int i ;
        for(i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        for( i = 0 ; i<n ; i++)
        {
            System.out.print( arr[i] + " ");
        }
        System.out.println("Largest Element = " + largestElement(arr));
    }
}

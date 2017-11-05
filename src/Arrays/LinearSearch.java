package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 15-06-2017.
 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int num)
    {
        for( int i=0 ; i<arr.length ; i++)
        {
            if ( arr[i] == num)
            {
                return i ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Enter number of elements in an array");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int num = s.nextInt();
        linearSearch( arr , num);
    }

}

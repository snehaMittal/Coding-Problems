package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques6 {

    public static int duplicateNumber( int[] arr)
    {
        int i , c=0 ;
        for( i=0 ; i<arr.length ; i++)
        {
            for ( int j=i+1 ; j<arr.length ; j++)
            {
                if ( arr[i] == arr[j])
                {
                    c = arr[i];
                    break ;
                }
            }
        }
        return c ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Enter number of elements in an array");
        int n = s.nextInt();
        int[] arr = new int[n];

        for( int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Duplicate number = " + duplicateNumber(arr));
    }
}

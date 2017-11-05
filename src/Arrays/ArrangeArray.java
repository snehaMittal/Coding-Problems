package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 15-06-2017.
 */
public class ArrangeArray {
    public static int[] arrange(int n) {

        int[] arr = new int[n];
        int c = n;
        for( int i=0 ; i<c ; i++)
        {
            if( i < (n/2))
            {
                arr[i] = (i * 2)+ 1;
            }
            else if ( i == (n/2))
            {
                arr[i] = n ;
                if(n%2 == 0)
                {
                    n=n-2;
                }
                else
                {
                    n=n-1;
                }
            }
            else
            {
                arr[i] = n;
                n = n-2 ;
            }
        }
        return arr;

    }
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Enter number of elements in an array");
        int n = s.nextInt();
        int[] input = arrange(n);
        for( int i=0 ; i<n ; i++)
        {
            System.out.print(input[i] + " ");
        }

    }
}

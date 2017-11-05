package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 15-06-2017.
 */
public class ArrayDifference {
    public static int findDifference(int[] input) {
        int odd=0 , even=0 ;
        for( int i=0 ; i<input.length ; i++)
        {
            if( i%2 == 0)
            {
                even = even + input[i];
            }
            else
            {
                odd = odd + input[i];
            }

        }
        return (even-odd);
    }

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Enter number of elements in an array");
        int n = s.nextInt();
        int[] input = new int[n];

        for( int i=0 ; i<n ; i++)
        {
            input[i] = s.nextInt();
        }
            System.out.println(findDifference(input));

    }
}

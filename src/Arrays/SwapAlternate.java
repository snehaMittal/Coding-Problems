package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 15-06-2017.
 */
public class SwapAlternate {


    public static void swapAlternate(int[] input) {
        for( int i=0 ; i<input.length ; i++)
        {
            if( i%2 == 0)
            {
                int temp = input[i];
                input[i] = input[i + 1];
                input[i+1] = temp ;
            }
        }
    }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int n = s.nextInt();
            int[] input = new int[n];

            for( int i=0 ; i<n ; i++)
            {
                input[i] = s.nextInt();
            }

        }
}

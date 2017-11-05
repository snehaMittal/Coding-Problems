package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques4 {

    public static void sumOfPosNeg ( int[] arr )
    {
        int positive=0 , negative=0;

        for(int i=0 ; i<arr.length ; i++)
        {
            if( arr[i] < 0)
            {
                negative = negative + arr[i];
            }
            else
            {
                positive = positive + arr[i];
            }
        }
        System.out.println("Sum of Positive Elements = " + positive);
        System.out.println("Sum of Negative Elements = " + negative);

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

        sumOfPosNeg ( arr );
    }
}

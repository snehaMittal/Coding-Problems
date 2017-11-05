package Assignment4;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques3 {

    public static int secondLargest(int[] arr)
    {
        int max=arr[0] , i , diff=Integer.MAX_VALUE  , pos=0, ans=0;

        for( i=0 ; i<arr.length ; i++)
        {
            if ( arr[i] > max)
            {
                max = arr[i];
                pos = i ;
            }
        }
        for( i=0 ; i<arr.length ; i++)
        {
            if( i != pos)
            {
                if ( diff > ( max - arr[i]))
                {
                    diff = (max - arr[i]);
                    ans = i ;
                }
            }
        }
        return arr[ans];
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = s.nextInt();

        int[] arr = new int[n];
        for( int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }

        System.out.println("Second Largest Number = " + secondLargest(arr));
    }
}

package Assignment4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques4 {

    public static void triplet(int[] arr , int x)
    {
        Arrays.sort(arr);
        for( int i=0 ; i<arr.length ; i++)
        {
            for( int j=i+1 ; j<arr.length ; j++)
            {
                for (int k=j+1 ; k<arr.length ; k++)
                {
                    if( (arr[i]+arr[j]+arr[k]) == x)
                    {
                        System.out.println(arr[i] + " , " + arr[j] + " , " + arr[k]);
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter length of the array");
        int n = s.nextInt();

        System.out.println("Enter array");

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter integer :");
        int x= s.nextInt();

        triplet( arr , x);
    }
}

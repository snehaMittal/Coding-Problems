package Assignment4;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques5 {

    public static void sorting(int[] arr)
    {
        int zero=0 , one=0 , two=0 ;
        for( int i=0 ; i<arr.length ; i++)
        {
            if( arr[i] == 0)
                zero = zero + 1 ;
            else if( arr[i] == 1)
                one = one + 1;
            else
                two = two + 1 ;
        }
        for( int i=0 ; i<zero ; i++)
        {
                System.out.print(" 0 ");
        }
        for( int i=0 ; i<one ; i++)
        {
            System.out.print(" 1 ");
        }
        for( int i=0 ; i<two ; i++)
        {
            System.out.print(" 2 ");
        }
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

        sorting( arr);

    }
}

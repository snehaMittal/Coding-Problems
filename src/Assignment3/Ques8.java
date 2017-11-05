package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques8 {

    public static void sumOfArray(int[] arr1 , int[] arr2)
    {
        int[] arr3 = new int[arr1.length];
        int i , rem=0;

        for( i=arr1.length-1 ; i>=0; i--)
        {
            int sum = 0 ;
            if( i == 0)
            {
                sum = rem + ( arr1[i] + arr2[i]) ;
            }
            else
            {
                sum = rem + (( arr1[i] + arr2[i]) % 10) ;
            }
            rem = ( arr1[i] + arr2[i] ) / 10 ;
            arr3[i] = sum ;
        }

        for (i=0 ; i<arr1.length ;i++)
        {
            System.out.print(arr3[i] + " ");;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int n1 = s.nextInt();
        int n2 = s.nextInt();


        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int i ;
        System.out.println("ARRAY 1 :");
        for( i=0 ; i<n1 ; i++)
        {
            arr1[i] = s.nextInt();
        }
        System.out.println("ARRAY 2 :");
        for( i=0 ; i<n2 ; i++)
        {
            arr2[i] = s.nextInt();
        }

        sumOfArray ( arr1 , arr2);

    }
}

package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques2 {

    public static int product( int[] arr)
    {

        int product=1 ;
        for( int i=0 ; i<arr.length ; i++)
        {
            product = product * arr[i];
        }
        return product ;
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

        System.out.println("Product of elemets = " + product(arr));
    }
}

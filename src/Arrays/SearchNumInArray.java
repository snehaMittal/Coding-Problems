package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 13-06-2017.
 */
public class SearchNumInArray {

    public static void search( int[] arr , int num)
    {
        int flag=1 ;
        for( int i=0 ; i<arr.length ; i++)
        {
            flag = 1;
            if( num == arr[i])
            {
                System.out.println(" Number found at position " + (i+1));
                break ;
            }
            else
                flag = 0 ;
        }
        if ( flag == 0)
        {
            System.out.println("Number not found");
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");

        int i ;
        for(i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter number to be searched");
        int num = s.nextInt();

        for( i = 0 ; i<n ; i++)
        {
            System.out.print( arr[i] + " ");
        }
        System.out.println(" ");
        search( arr , num);

    }
}

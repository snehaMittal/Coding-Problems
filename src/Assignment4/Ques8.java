package Assignment4;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques8 {

    public static void waveSort( int[] arr)
    {
        int temp , c;

        for( int i=0 ; i<arr.length ; i++)
        {
            for( int j=0 ; j<(arr.length-1) ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }

            }
        }
        if ((arr.length % 2) == 0)
            c = (arr.length / 2) - 1;
        else
            c = (arr.length/2)  ;

        for (int i=0 ; i<arr.length ; i++)
        {
            System.out.print( arr[c] + " ");
            if( (i%2) == 0)
            {
                c =c + (-i-1);
            }
            else
            {
                c = c +(i+1);
            }

        }

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter number of elements in an array");
        int n = s.nextInt();
        int[] arr = new int[n];

        for( int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        waveSort(arr);

    }
}

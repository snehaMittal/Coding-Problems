package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 17-06-2017.
 */
public class pushZeroesToEnd {

    public static void pushZerosAtEnd(int[] arr)
    {
        int[] temp = new int[arr.length];
        int k=0 ;
        for (int i=0 ; i<arr.length ; i++)
        {
            if( arr[i] != 0)
            {
                temp[k] = arr[i];
                k++;
            }
        }
        for(int i=0 ; i<arr.length ; i++)
        {
            if(i<k)
            {
                arr[i] = temp[i];
            }
            else
                arr[i] = 0 ;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = s.nextInt();
        }
        pushZerosAtEnd(arr);
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]);
        }

    }
}

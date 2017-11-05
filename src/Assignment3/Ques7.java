package Assignment3;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques7 {

    public static int nonDuplicate(int[] arr)
    {
        int flag=0 , c=0;
        for( int i=0 ; i<arr.length ; i++)
        {
            flag = 0 ;
            for( int j=0 ; j<arr.length ; j++)
            {
                if( j != i)
                {
                    if ( arr[i] == arr[j])
                    {
                        flag = 0 ;
                        break ;
                    }
                    else
                    {
                        flag = 1 ;
                        c = arr[i];
                    }
                }
            }
            if( flag == 1)
            {
                return c ;
            }
        }
        return c ;
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

        System.out.println("First Non- Duplicate Array = " + nonDuplicate(arr));

    }
}

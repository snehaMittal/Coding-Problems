package Assignment4;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques7 {

    public static int equilibriumIndex( int[] arr)
    {
        int index=0 , flag=0 ;

        index = (arr.length/2);
        while(flag == 0)
        {
            int sum1 =0 , sum2 = 0 ;
            for( int i=0 ; i<arr.length ; i++)
            {
                if( i < index)
                    sum1 = sum1 + arr[i];
                if( i > index)
                    sum2 = sum2 + arr[i];
            }
            if (sum1 > sum2)
            {
                --index;
            }
            else if (sum2 > sum1)
            {
                ++index ;
            }
            else
            {
                return index ;
            }
        }
        return index;
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

        System.out.println(equilibriumIndex(arr));

    }
}

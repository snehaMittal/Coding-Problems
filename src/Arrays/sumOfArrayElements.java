package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 19-06-2017.
 */
public class sumOfArrayElements {

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2)
    {
        int rem=0 , sum=0 , k;

        if (arr1.length > arr2.length)
        {
            k=(arr1.length+1) ;
        }
        else
        {
            k = arr2.length+1 ;
        }

        int[] temp = new int[k];

        if (arr1.length > arr2.length)
        {
            int n = arr1.length-arr2.length ;
            for (int i=(arr2.length - 1) ; i>=0 ; i--)
            {
                sum = (rem + arr2[i] + arr1[i+n])%10;
                temp[k-1] = sum ;
                rem = (arr2[i] + arr1[i+n]) / 10 ;


                k = k - 1 ;
            }
            for( int i=(n-1) ; i>=0 ; i--)
            {
                sum = ( rem + arr1[i]) % 10 ;
                temp[k-1] = sum ;
                rem = (arr1[i] + rem ) / 10 ;

                k-- ;
            }
        }
        else
        {
            int n = arr2.length-arr1.length ;
            for (int i=(arr1.length - 1) ; i>=0 ; i--)
            {
                sum = rem + (arr1[i] + arr2[i+n])%10;
                temp[k-1] = sum ;
                rem = (arr1[i] + arr2[i+n])/ 10 ;

                k = k - 1 ;
            }
            for( int i=(n-1) ; i>=0 ; i--)
            {
                sum = ( rem + arr2[i]) % 10 ;
                temp[k-1] = sum ;
                rem = (arr1[i] + rem) / 10 ;

                k-- ;
            }

        }
        temp[0] = rem;


        return temp;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int arr1[] = new int[n1];
        for(int i=0 ; i<n1 ; i++)
        {
            arr1[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int arr2[] = new int[n2];
        for(int i=0 ; i<n2 ; i++)
        {
            arr2[i] = s.nextInt();
        }
        int[] arr3 = sumOfTwoArrays( arr1 , arr2);
        for (int i=0 ; i<arr3.length ; i++)
        {
            System.out.print( arr3[i] + " " );
        }

    }
}

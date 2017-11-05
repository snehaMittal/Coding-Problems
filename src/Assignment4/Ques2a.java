package Assignment4;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques2a {

    public static void intersection(int[] arr1, int[] arr2){
        int k=0 ;
        for( int i=0 ; i<arr1.length ; i++)
        {
            for( int j=0 ; j<arr2.length ; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]);
                    break ;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n1 = s.nextInt();
        int i ;

        int[] arr1 = new int[n1];
        System.out.println("Array 1 :");
        for( i=0 ; i<n1 ; i++)
        {
            arr1[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Array 2:");
        for( i=0 ; i<n2 ; i++)
        {
            arr2[i] = s.nextInt();
        }

        intersection(arr1,arr2);

    }
}

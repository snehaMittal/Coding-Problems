package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 15-06-2017.
 */
public class BinarySearch {

    public static int binarySearch(int[] arr , int num) {
        int  beg=0 , end=(arr.length-1);
        int mid = (end - beg)/2 ;
        while ( beg<=end)
        {
            if ( arr[mid] == num)
            {
                return mid;
            }
            else if ( arr[mid] < num )
            {
                beg = mid  ;
                mid = mid + ((end - beg)/2);
            }
            else if( arr[mid] > num)
            {
                end = mid ;
                mid = mid - ((end - beg)/2);
            }

        }
        return -1;



    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter number to be searched ");
        int num = s.nextInt();

        System.out.println(binarySearch(arr , num ));


    }
}
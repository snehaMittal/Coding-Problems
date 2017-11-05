package Assignment4;

import java.util.Scanner;

/**
 * Created by Sneha on 14-06-2017.
 */
public class Ques6 {

    public static int rotatingElement(int[] arr)
    {
        int answer=0 ;
        for(int i=0 ; i<arr.length-1 ; i++)
        {
            if( arr[i] > arr[i+1])
            {
                answer = answer + 1 ;
                return answer ;
            }
            else
                ++answer;
        }
        return answer;
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
        System.out.println(rotatingElement(arr));

    }
}

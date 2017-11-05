package Arrays;

import java.util.Scanner;

/**
 * Created by Sneha on 20-06-2017.
 */
public class maxSum {

    public static long maximumSumPath(int[] input1, int[] input2)
    {
        int i = 0, j = 0 , m=input1.length , n=input2.length ;

        long result = 0, sum1 = 0, sum2 = 0;
        while (i < m && j < n)
        {
            if (input1[i] < input2[j])
            {
                sum1 += input1[i];
                ++i ;

                System.out.println(sum1);
                System.out.println(sum2);
            }
            else if (input1[i] > input2[j])
            {
                sum2 += input2[j];
                ++j ;

                System.out.println(sum1);
                System.out.println(sum2);
            }
            else
            {
                if(sum1>sum2)
                {
                    result = result + sum1 ;
                }
                else
                {
                    result = result + sum2 ;
                }

                System.out.println(sum1);
                System.out.println(sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < m && j < n && input1[i] == input2[j])
                {
                    result = result + input1[i];
                    i++;
                    j++;
                }
            }
        }

        while (i < m)
        {
            sum1 += input1[i++];
        }
        while (j < n)
        {
            sum2 += input2[j++];
        }

        System.out.println(sum1);
        System.out.println(sum2);
        if(sum1>sum2)
        {
            result = result + sum1 ;
        }
        else
        {
            result = result+ sum2 ;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int[] input1 = new int[m] ;
        for (int i=0 ; i<m ; i++)
        {
            input1[i] = s.nextInt();
        }
        int n = s.nextInt();
        int[] input2 = new int[n] ;
        for (int i=0 ; i<n ; i++)
        {
            input2[i] = s.nextInt();
        }
        System.out.println( maximumSumPath(input1 , input2));
    }
}

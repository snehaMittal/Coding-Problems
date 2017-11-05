package String;

import java.util.Scanner;

/**
 * Created by Sneha on 19-06-2017.
 */
public class largestRowandCol {

    public static void findLargest(int input[][])
    {
        int row_sum=0 , col_sum=0 , max=Integer.MIN_VALUE , row=0 , col=0 ,flag=-1;
        for (int i=0 ; i<input.length ; i++)
        {
            row_sum=0;
            col_sum=0;
            for (int j=0 ; j<input[0].length ; j++)
            {
                row_sum = row_sum + input[i][j] ;
                if(i<input[0].length && j<input.length )
                {
                    col_sum = col_sum + input[j][i] ;
                }

            }
            if (input.length > input[0].length && i<input[0].length)
            {
                int n=(input.length - input[0].length) , k=input[0].length ;
                for(int j=(k) ; j<(k+n) ; j++)
                {
                    col_sum = col_sum + input[j][i];
                }
            }
            if (row_sum > max)
            {
                flag = 0 ;
                row = i ;
                max = row_sum ;
            }
            if (col_sum > max)
            {
                flag = 1 ;
                col = i ;
                max = col_sum;
            }

        }
        if( flag == 0)
        {
            System.out.println( "row " + row + " " + max);
        }
        else
        {
            System.out.println("column " + col + " " + max);
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] input = new int[m][n] ;
        for (int i=0 ; i<m ; i++)
        {
            for (int j=0 ; j<n ; j++)
            {
                input[i][j] = s.nextInt();
            }
        }

        findLargest(input);

    }
}

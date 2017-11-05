package String;

import java.util.Scanner;

/**
 * Created by Sneha on 18-06-2017.
 */
public class wavePrint {

    public static void wavePrint(int input[][])
    {
        for(int i=0 ; i<input[0].length ; i++)
        {
            if (i%2 == 0)
            {
                for(int j=0 ; j<input.length ; j++)
                {
                    System.out.print(input[j][i] + " ");
                }
            }
            else
            {
                for(int j=input.length-1 ; j>=0 ; j--)
                {
                    System.out.print(input[j][i] + " ");
                }
            }

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
        wavePrint(input);
    }
}

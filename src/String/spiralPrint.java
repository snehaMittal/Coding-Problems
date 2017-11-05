package String;

import java.util.Scanner;

/**
 * Created by Sneha on 18-06-2017.
 */
public class spiralPrint {

    public static void spiralPrint(int matrix[][])
    {
        int i , a=0 , b=0 , c=matrix.length , d=matrix[0].length;
        while( a<c && b<d)
        {
            for (i=b ; i<d ; i++)
            {
                System.out.print( matrix[a][i] + " ");
            }
            a++ ;
            for (i=a ; i<c ; i++)
            {
                System.out.print( matrix[i][d-1] + " ");
            }
            d-- ;
            if( a< c)
            {
                for (i=d-1 ; i>=b ; i--)
                {
                    System.out.print(matrix[c-1][i] + " ");

                }
                c-- ;
            }
            if ( b<d)
            {
                for (i=c-1 ; i>=a ; i--)
                {
                    System.out.print(matrix[i][b] + " ");
                }
                b++;
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
        spiralPrint( input );
    }
}

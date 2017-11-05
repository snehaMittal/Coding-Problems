package String;

import java.util.Scanner;

/**
 * Created by Sneha on 18-06-2017.
 */
public class rowWiseSum {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr = new int[m][n] ;
        for(int i=0 ; i<m ; i++)
        {
            for (int j=0 ; j<n ; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
        for(int i=0 ; i<m ; i++)
        {
            int sum=0 ;
            for(int j=0 ; j<n ; j++)
            {
                sum = sum + arr[i][j] ;
            }
            System.out.print(sum + " ");
        }
    }
}

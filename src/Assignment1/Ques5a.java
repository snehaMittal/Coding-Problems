package Assignment1;
import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques5a {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i , j  ;
        int n = s.nextInt();
        for(i=0 ; i<n ; i++)
        {
            for(j=1; j<=(n-i) ; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}

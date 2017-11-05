package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques5d {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i,j,l,k,m;

        if(n%2==0)
        {
            n=n+1;
        }

        for(i=0;i<(n/2)+1;i++)
        {
            j=0;
            while(j<(n/2)-i)
            {
                System.out.print(" ");
                j++;
            }

            j=1;
            k=i*2+1;
            while(j<=k)
            {
                System.out.print("*");
                j++;
            }

            System.out.println();

        }
        m=0;

        for(i=n/2 +1;i<n;i++)
        {
            j=0;
            while(j<=m)
            {
                System.out.print(" ");
                j++;
            }
            m++;

            j=1;
            l=n-i-1;
            k=l*2+1;
            while(j<=k)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }


    }

}

package Assignment1;

import java.util.Scanner;

/**
 * Created by Sneha on 12-06-2017.
 */
public class Ques3 {

    public static void prime( int num)
    {
        int i , j , flag=1;
        if(num >= 2)
        {
            System.out.print("2 ");
        }
        for(i = 3 ; i<num ; i++)
        {

            flag = 1;
            j = 2;
            while(j < i)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                j++ ;
            }
            if( flag == 1)
                System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        prime( num);

    }
}

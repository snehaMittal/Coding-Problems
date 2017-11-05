package Test2;

import java.util.Scanner;

/**
 * Created by Sneha on 10-07-2017.
 */
public class ques2 {


    public static String[] allStrings(String S, int b)
    {
        String[] smallAns = new String[1000];
        int i,j,k,l,m,a=0;
        if ( b == 1)
        {
            for (i=0 ; i<S.length() ; i++)
            {
                smallAns[a] = S.substring(i,i+1);
                a++ ;
            }
        }
        else if (b == 2)
        {
            for (i=0 ; i<S.length() ; i++)
            {
                for (j=0 ; j<S.length() ; j++)
                {
                    smallAns[a] = S.substring(i,i+1)+S.substring(j,j+1);
                    a++ ;
                }
            }
        }
        else if (b == 3)
        {

            for (i=0 ; i<S.length() ; i++)
            {
                for (j=0 ; j<S.length() ; j++)
                {
                    for (k=0 ; k<S.length() ; k++)
                    {

                        smallAns[a] = S.substring(i,i+1)+S.substring(j,j+1)+S.substring(k,k+1);
                        a++ ;
                    }
                }
            }
        }
        else if (b == 4)
        {
            for (i=0 ; i<S.length() ; i++)
            {
                for (j=0 ; j<S.length() ; j++)
                {
                    for (k=0 ; k<S.length() ; k++)
                    {
                        for (l=0 ; l<S.length() ; l++)
                        {
                            smallAns[a] = S.substring(i,i+1)+S.substring(j,j+1)+S.substring(k,k+1)+S.substring(l,l+1);
                            a++;
                        }
                    }
                }
            }
        }
        else
        {
            for (i=0 ; i<S.length() ; i++)
            {
                for (j=0 ; j<S.length() ; j++)
                {
                    for (k=0 ; k<S.length() ; k++)
                    {
                        for (l=0 ; l<S.length() ; l++)
                        {
                            for (m=0 ; m<S.length() ; m++)
                            {
                                smallAns[a] = S.substring(i,i+1)+S.substring(j,j+1)+S.substring(k,k+1)+S.substring(l,l+1) + S.substring(m,m+1);
                                a++;
                            }
                        }
                    }
                }
            }
        }
        String[] ans = new String[a];
        for (i=0 ; i<a ; i++)
        {
            ans[i] = smallAns[i];
        }
        return ans;
    }
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
        String str = "abc";
        String[] ans = allStrings(str , 2);
        for (String a:ans)
        {
            System.out.println(a);
        }
    }
}

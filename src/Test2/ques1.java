package Test2;

import java.util.*;

/**
 * Created by Sneha on 10-07-2017.
 */
public class ques1 {

    static String timeConversion(String s) {


        System.out.println();


        // Complete this function
        String str="";
        if( s.charAt(8) == 'P')
        {
            if(s.charAt(0) == '0' && s.charAt(1) == '1')
            {
                str = "13" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '0' && s.charAt(1) == '2')
            {
                str = "14" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '0' && s.charAt(1) == '3')
            {
                str = "15" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '0' && s.charAt(1) == '4')
            {
                str = "16" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '0' && s.charAt(1) == '5')
            {
                str = "17" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '0' && s.charAt(1) == '6')
            {
                str = "18" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '0' && s.charAt(1) == '7')
            {
                str = "19" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '0' && s.charAt(1) == '8')
            {
                str = "20" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '0' && s.charAt(1) == '9')
            {
                str = "21" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '1' && s.charAt(1) == '0')
            {
                str = "22" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '1' && s.charAt(1) == '1')
            {
                str = "23" + s.substring(2 , s.length()-2);
            }
            else if(s.charAt(0) == '1' && s.charAt(1) == '2')
            {
                str = s.substring(0 , s.length()-2);
            }

        }
        else
        {
            if(s.charAt(1) == '1' && s.charAt(1) == '2')
            {
            str = "00" + s.substring(2 , s.length()-2);
            }
            else
            {
                str = s.substring(0 , s.length()-2);
            }


        }
        return str;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        String result = timeConversion(s);
//        System.out.println(result);
//        Queue<>
    }

}

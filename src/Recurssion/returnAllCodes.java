package Recurssion;

import java.util.Scanner;

/**
 * Created by Sneha on 25-06-2017.
 */
public class returnAllCodes {

    //pehli bt to ye fun glt h
    // 2 ke corr a b c return hna chahiye
    // han yh return krta h vhi

    public static String character(int num)
    {
        String[] arr = {"" , "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" ,"u" , "v" , "w" , "x" , "y" , "z"};
        return arr[num];
    }

//    public static String[] helper(int input){
//
//        if(input == 0){
//
//            String[] ans = {""};
//            return ans;
//        }
//
//        String ans[];
//        if(input < 10 || input%100 > 26){
//
//
//            String ans1[] = helper(input/10);
//            ans = new String[ans1.length];
//
//            for(int i = 0 ; i < ans.length ; i++){
//                ans[i] = ans1[i] + character(input%10);
//            }
//
//
//            return ans;
//
//        }else{
//            String ans1[] = helper(input/10);
//            String ans2[] = helper(input/100);
//
//            ans = new String [ans1.length + ans2.length];
////            int k=0;
//
//            for (int i=0 ; i<ans1.length ; i++)
//            {
//                ans[i] = ans1[i] + character(input%10);
////                k++;
////                ans[k] = ans2[i] + character(input)
//            }
//
//            for (int i=0 ; i<ans2.length ; i++)
//            {
//                ans[i+ans1.length] = ans2[i] + character(input%100);
////                k++;
////                ans[
////k] = ans2[i] + character(input)
//            }
//            return ans;
//        }

//        String ans1[] = helper(input/10);


//    }


    public static  String[] getCode(String input)
    {
        if (input.length() <= 0 )
        {
            String[] str = {" "};
            return str ;
        }
        String ch1 = character((int)(input.charAt(0)) - 48);
        String[] ans ;
        int num=100 ;
        if (input.length() >= 2)
        {
            num = ((int)(input.charAt(0))-48)*10 + ((int)(input.charAt(1))-48) ;
        }
        String ch2 = "" ;
        if (num >= 10 && num <= 26)
        {
            ch2 = character(num);
            String[] ans1 = getCode(input.substring(1));
            String[] ans2 = getCode(input.substring(2));
            ans = new String[ans1.length + ans2.length];

            for (int i=0 ; i<ans1.length ; i++) {
                ans[i] = ch1 + ans1[i] ;
            }
            for (int i=0 ; i<ans2.length ; i++) {
                ans[i+ans1.length] = ch2 + ans2[i];
            }
        }
        else {
            String[] ans1 = getCode(input.substring(1));
            ans = new String[ans1.length];
            for (int i=0 ; i<ans.length ; i++) {
                ans[i] = ch1 + ans1[i];
            }
        }
        return ans;

    }

    public static void main(String[] args)
    {
        String output[] = getCode("1123");
        for (String ans:output)
        {
            System.out.println(ans);
        }
    }
}

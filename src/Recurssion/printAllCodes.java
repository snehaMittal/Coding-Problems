package Recurssion;

/**
 * Created by Sneha on 06-07-2017.
 */
public class printAllCodes {

    public static void printAllPossibleCodes(String input)
    {
        printAllPossibleCodes(input , "");
    }
    public static void printAllPossibleCodes(String input , String result)
    {
        if (input.length() == 0)
        {
            System.out.println(result);
            return;
        }
        int num=100 ;

        String ch1 = character((int)(input.charAt(0)) - 48);
        printAllPossibleCodes(input.substring(1) , result+ch1);
        if (input.length() >= 2)
        {
            num = ((int)(input.charAt(0))-48)*10 + ((int)(input.charAt(1))-48) ;
        }
        String ch2 = "" ;
        if (num <= 26)
        {
            ch2 = character(num) ;
            printAllPossibleCodes(input.substring(2) , result+ch2);
        }
    }

    public static String character(int num)
    {
        String[] arr = {"" , "a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" ,"u" , "v" , "w" , "x" , "y" , "z"};
        return arr[num];
    }

    public static void main(String[] args) {
        printAllPossibleCodes("1234");
    }
}

package String;

import java.util.Scanner;

/**
 * Created by Sneha on 20-06-2017.
 */
public class highestOccuringChar {

    public static char highestOccuringCharacter(String inputString)
    {
        int[] count = new int[200];
        for (int i=0 ; i<inputString.length() ; i++)
        {
            count[inputString.charAt(i)]++ ;
        }
        int max = -1 ;
        char result=0 ;
        for (int i = 0; i < inputString.length(); i++) {
            if (max < count[inputString.charAt(i)]) {
                max = count[inputString.charAt(i)];
                result = inputString.charAt(i);
            }
        }
        return result ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(highestOccuringCharacter(str));

    }
}

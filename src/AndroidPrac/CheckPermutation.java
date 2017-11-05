package AndroidPrac;

/**
 * Created by Sneha on 19-08-2017.
 */
public class CheckPermutation {
    public static boolean isPermutation(String input1, String input2) {
        if(input1.length() != input2.length())
            return false ;
        else {
            String str = "";
            int i=0 ;
            while( i < input1.length()) {
                int j = 0 ;
                while(j<input2.length()) {
                    if( input2.charAt(j) == input1.charAt(i)) {
                        input2 = input2.substring(0 ,j) + input2.substring(j+1 , input2.length() );
                        break ;
                    }
                    j++ ;
                }
                i++ ;
            }
            if( input2.length() == 0)
                return true ;
            else
                return false ;
        }
    }

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        String str1 = s.nextLine();
        System.out.println(isPermutation("abba" , "baab"));
    }

}

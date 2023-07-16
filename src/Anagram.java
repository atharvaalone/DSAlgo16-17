import java.util.Arrays;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String Str1 = sc.nextLine();
        String Str2 = sc.nextLine();

        Str1 = Str1.toLowerCase();
        Str2 = Str2.toLowerCase();
        charArray(Str1,Str2);
    }
        public static void charArray(String str1,String str2)
        {

            if (str1.length() == str2.length()) {


                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();


                Arrays.sort(charArray1);
                Arrays.sort(charArray2);


                boolean result = Arrays.equals(charArray1, charArray2);

                if (result) {
                    System.out.println(str1 + " and " + str2 + " are anagram.");
                }
            }
        }
    }

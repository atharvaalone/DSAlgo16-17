import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message");
        String str= sc.nextLine();
        String str1="name";
        String str2="full Abhishek";
        String str3="91-xxxxxxxxxxx";
        String str4="XX/XX/XXXX";
        Pattern pat1=Pattern.compile(str1);
        Matcher mat1= pat1.matcher(str);
        String a=mat1.replaceAll("Abhishek ");

        Pattern pat2=Pattern.compile(str2);
        Matcher mat2= pat2.matcher(a);
        String b=mat2.replaceAll("Abhishek Gautam");

        Pattern pat3=Pattern.compile(str3);
        Matcher mat3= pat3.matcher(b);
        String c=mat3.replaceAll("91-7497943968");


        Pattern pat4=Pattern.compile(str4);
        Matcher mat4= pat4.matcher(c);
        String d=mat4.replaceAll("01/07/2000");

        System.out.println(d);


    }

}

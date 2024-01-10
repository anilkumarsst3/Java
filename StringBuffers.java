import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class StringBuffers {

    public static void main(String[] args) {

        char[] arr = {'s', 'c', 'd', 'g', 'h'};

        String str = String.copyValueOf(arr);
        System.out.println(str);
        String sixteen = "The new String equals This is a sample String.";
        // copy the content of the string into byte array.
        byte[] ar1 = sixteen.getBytes();
        // creating  anew string out of byte array.
        String new_str = new String(ar1);
        System.out.println(new_str);

        //declare a string "ac@2a139a55"
        String str2 = "ac@2a139a55";
        // copy the content of the string into a char array
        char[] ch1 = str2.toCharArray();
        System.out.println("The char array equals \"" + ch1 + "\"");

        String r = "\"rom\"";
        System.out.println(r);
        String str3 = "The hash for Python Exercises";
        System.out.println("The hash for python exercises \"" + str3.hashCode() + "\"");

        String str4 = "The quick brown fox jumps over the lazy dog";
        char ch = 'a';
        //int a=str4.indexOf('a',0);
        // colonical representations of the string.
        // get three strings
        String eco = "javavertualmachine";
        String eco1 = new StringBuffer("java").toString();
        System.out.println(eco1);
        String eco2 = eco.intern();
        // String eco1="javavertualmachine";
        //String eco2="javavertualmachine";
        //using equalsIgnorecase method to check the canonical rep.
     /*  boolean b=eco.equalsIgnoreCase(eco1);
        System.out.println(b);
       boolean c=eco1.equalsIgnoreCase(eco2);
        System.out.println(c);
       boolean d=eco.equalsIgnoreCase(eco2);
        System.out.println(d);

*/
        //equals method is very expensive so we will be using == operator
        System.out.println("eco==eco1? " + (eco == eco1));
        System.out.println("eco1==eco2? " + (eco == eco2));
        // find the length of string
        String str6 = "example.com";
        System.out.println("The string length of 'example.com' is: " + str6.length());


    }
}
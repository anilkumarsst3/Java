import java.util.Scanner;
import java.util.*;

public class String_manupulation {
    static String sb;
    static boolean d = true;
    static boolean seq;

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // Main class for string manupulation
/*
        String s = "Java Exercises!";
        //int index1= s.charAt()
        System.out.println(s.charAt(11));
        String_manupulation.unicode();
        String_manupulation.UnicodeRange();
        String_manupulation.StringCampare();
        //System.out.println(d);
        String_manupulation.Concate();
        System.out.println(sb);
        String_manupulation.SpecificChar();
        System.out.println(seq);


    }


    public static void unicode() {
        String s = "w3resource.c0om";
        int unicode = s.codePointAt(4);
        System.out.println("unicode at index[3]= " +
                unicode);

    }

    //Write a Java program to count a number of
    // Unicode code points in the specified
    // text range of a String.
    public static void UnicodeRange() {
        String unicode = "w3resource.c0om";
        int unicoderange = unicode.codePointCount(0, 3);
        System.out.println("unicode at index[3]= " +
                unicoderange);
    }
    //  Campare two strings lexicographically.

    public static void StringCampare() {
        String a = "This is exercise 1";
        String b = "This is Exercise 2";
        d = a.equalsIgnoreCase(b);

        System.out.println(d);
    }

    public static void Concate() {

        String onw = "PHP Exercises and";
        String two = "Python Exercises";
        String three = " and java also";
        sb = new StringBuffer(onw).append(two).append(three).toString();


    }
    // if a given string contains the specified
    // sequence of char values

    public static boolean SpecificChar() {
        String original = "PHP Exercises and Python Exercises  ";
        String and = "and";
        seq = original.contains(and);
        return seq;




    }*/
        // String trim method of String class.
        // It remove any leading and trailing space from a string.
        String str = "    I am in java    class";
        String res = str.trim();
        System.out.println(res);
        // Replace all the whitespace with empty string.

        res= str.replaceAll("\\s","");
        System.out.println(res);// It is removing all the white spaces.

        String str2 = "Learn\nJava Programming\n\n   ";
        res=str2.trim();
        System.out.println(res);

        System.out.println(str.charAt(0));





    }
}
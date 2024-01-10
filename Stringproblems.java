import java.util.Scanner;

public class Stringproblems {
   static int count=0;
    // remove all the consonates from a string.
    public static void main(String[] args) {

        String str = "Hello, have a good day";
        System.out.println(removeconst(str));
        String newst = Stringproblems.name("Stewart", "Middle", "johnson");
        System.out.println(newst);
       // System.out.println(remove_vcdw(str));
        System.out.println(str);

    }

    // method for replacing all consonates
    static String removeconst(String str) {

        return str.replaceAll("[F^H||b^d||f^h^g||j^n||p^t||v^x||z]", "");

    }
    // get the full name and retrun F-abb, m-abb, full last name.

    static String name(String fname, String Mname, String lname) {
        return fname.charAt(0) + Mname.toString() + lname.charAt(0);
    }
    // write a program to find the no. of vowel, constants and digits, whitespaces




    }
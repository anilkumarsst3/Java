import java.util.ArrayList;
import java.util.Scanner;

public class Swapping_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int a = 6;
        int b = 8;
        int temp;
        //number before swapping using 3rd variable.
        System.out.println("Number before swaping");
        System.out.println("a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Number after swaping");
        System.out.println("a = " + a + ", b = " + b);

        //Swaping without using third variable.
     int x=10;
     int y=15;
     x=x+y;
     y=x-y;
     x=x-y;

        System.out.println("x = "+x+",y = "+y);
        // Finding some of different places digits.
        int number=12345;
        int f_digi=12345/10000;
        System.out.println(f_digi);
        int s_digit=12345/1000;
        System.out.println(s_digit);
        int sum=f_digi+s_digit;
        System.out.println(sum);
*/
        //By using module operation
     /*   int number=2642;
        while (number!=0){
          int digits=number%10; // 2
            digits=digits+2;
            System.out.print(digits);
          number=number/10;


        }*/
        //Write a program to calculate the sum of the digits of a 3-digit number.
        //input=123 op=6;
        int number = 2642;
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.print(sum);
    }

}

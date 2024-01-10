import java.util.Scanner;

public class ReverseNumber {
   static int rev = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       System.out.println("enter the number\n");
        int number = sc.nextInt();
        int rem;
        while (number!=0) {
            rem = number % 10; //1523%10=3
            rev = rev * 10 + rem;//0*3+3=3;
            number = number / 10;  //1523/10=152
        }
        System.out.print(rev);

    }

}

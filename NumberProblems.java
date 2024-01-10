import java.util.Scanner;

public class NumberProblems {
    static int armnum;

    // find the sum of digits input:123 out=6;
    public static void main(String[] args) {
        double sum = 0;
       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers\n");
        int num = sc.nextInt();
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of all digits: " + sum);*/
// 152=1^2+5^2+3^2=153 armstrong number >>find armstrong number
        //between 100-500.

        for (int i = 0; i <= 500; i++) {
            int t = i;
            while (t != 0) {
                int rem=t%10;
                sum = sum + (double)Math.pow(rem,3);
                t = t / 10;

            }
            if (sum == i) {
                System.out.println(i);

            }

        // find all the prime number 1-100;
            int count=0;
            int nnum=0;



        }

    }

}

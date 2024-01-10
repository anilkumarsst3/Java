import java.util.Scanner;
/*Author:Anil Kumar
Dated: 21 Dec-2022.
Code: Prime Number*/
public class PrimeNumber {
    public static void main(String[] args) {
        // checking if the number is a prime number;
        // A  prime number is divided by 1 and itself;
        // So in case of 7 it should be divided by only 1 and 7.
        //Let's check if 7 is divided from the number between 2-7.
        /*int num = 13;
        int count = 0;
        // we will  use for loop from num 2-6. we won't check by 1 and 7.
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }
        if (count > 1) {
            System.out.println(num + " is Not a prime number");
        } else {
            System.out.println(num + " is a Prime number");
        }*/
        //  Now we will implement same for to find out all the prime number
        // between 1-100;
        // First of all we will use two for loop 1 for reading nub
        // between 1-100 & 2 for dividend 2-99.
        // This Program will not print 1 since 1 is not a prime number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number");
        int starting_num = sc.nextInt();

        System.out.println("Enter End number");
        int end_num = sc.nextInt();

        if (starting_num == 1) {
            starting_num = starting_num + 1;
        }
        int count1 = 0;
        for (int num = starting_num; num <= end_num; num++) {
            for (int j = 2; j <= num - 1; j++) {
                if (num % j == 0) {
                    count1 += 1;
                }

            }
            if (count1 == 0) {
                System.out.println(num);
            } else {
                count1 = 0;
            }
        }
    }
}



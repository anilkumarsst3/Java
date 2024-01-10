import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int leap_year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        leap_year = sc.nextInt();
        if (leap_year % 4 == 0) {
            if (leap_year % 100 == 0) {
                if (leap_year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("not a leap year");
                }
            }
else {
                System.out.println(" a leap year");
            }

        }
        else {
            System.out.println("not a leap year");
        }

    }


}

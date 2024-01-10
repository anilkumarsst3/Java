import java.util.*;
import java.util.Scanner;

public class raised_To_Power {
    public static void main(String[] args) {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int base = sc.nextInt();

        System.out.println("enter power");
        int power = sc.nextInt();
        for(int i=1;i<=power;i++){
            result=result*base;
// result*base=1*3=3(new result) now again condition is
//aslo true for 2 so base will again multiple with
//new result so>3*3=9(new result)*base(becasue condtion is)
//is still true 9*3=27. Now condtion false and loop
// will exit and
        }
        System.out.println(result);
      //print here all the result collectively.
    }
}


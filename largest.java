import java.awt.*;
import java.util.Scanner;

public class largest {


    public static void main(String []args){
        int a = 0,b = 0,c = 0,temp,largest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        sc.nextInt();
        System.out.println("Enter b value");
        sc.nextInt();
        System.out.println("Enter c value");
        sc.nextInt();

        temp= a>b?a:b;
       largest=c>temp?c:temp;
        System.out.println(largest);


    }


}

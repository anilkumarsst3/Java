import java.util.Scanner;
import java.util.Stack;

public class IntinputandAvg {

    public static void main(String[] args) {
        // Get the input number from uese until press q and
        // calculate sum and product.
        // input number until user quit.
        String choice = "";
        int sum=0;
        int product=1;
        int count=0;
        Scanner sc = new Scanner(System.in);

        while (!choice.equalsIgnoreCase("q")) {
            System.out.println("enter numbers or q to quit\n");
            choice = sc.next(); // it will take the number until press q

       if(!choice.equalsIgnoreCase("q")){
          int number=Integer.parseInt(choice);
          sum=sum+number;
          product=product*number;
          count++;

        }

        }

        System.out.println(sum);
        System.out.println(product);

    }
}


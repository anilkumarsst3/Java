import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the positive integer");
        num = sc.nextInt();
        int j;
        for (j = 1; j <= num; j++) {
            System.out.println("The prodduct of " + j + " *" +num+"= "+(j*num));
        }

        }

}





import java.util.Scanner;


public class TelephoneBill {

    public static void main(String[] args) {
        int calls;
        double amount = 200;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of calls");
        calls=sc.nextInt();

        if (calls < 100) {
            amount= 200;
            System.out.println(amount);
        } else if (calls>100&&calls<150){
            amount = amount + (calls * .40);
            System.out.println(amount);

        }else if (calls>150&&calls<200){
            amount = amount + (calls * .50);
            System.out.println(amount);
        }
        else {
            amount= amount+ 50*.60+50*.50+(calls-200)*.40;
            System.out.println(amount);
        }


    }


}

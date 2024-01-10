import java.util.Scanner;

public class Revenue {
   static double discount ;
    public static void main(String[] args) {
        double revenue;
        System.out.println(discount);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount of one item");
        int cost_of_oneitem = sc.nextInt();

        System.out.println("Enter total no of items");
        int total = sc.nextInt();
// total revenue
        revenue = cost_of_oneitem * total;
        //discount=0;
        if (revenue > 5000) {
            discount = revenue * 90 / 100;
        }

        System.out.println("Revenue = " + revenue);
        System.out.println("Discount= " + discount);

    }}
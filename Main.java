import java.util.*;
public class Main {
    public static void main(String[] args) {
        double area, parameter;
        Scanner sc = new Scanner(System.in);
      // enter the value of radius from user.
        System.out.println(("enter ur radius"));
        int r= sc.nextInt();
        area= Math.PI*r*r;
        System.out.println("Area = " +area);
        parameter=2*Math.PI*r;
        System.out.println("peremeter = "+ parameter);
    }
}
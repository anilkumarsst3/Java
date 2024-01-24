import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class ArrayListcolor {
    public static void main(String[] args) {


        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        // average
        // sum
        int sum = 0;
        double averge;
        for (int a : numbers) {
            sum = sum + a;

        }
        System.out.println(Arrays.toString(numbers));// puting inside a bracket.
        averge = (double) sum / (double) numbers.length;// here the wide casting has
        // been perform by conveting int into double.
        System.out.println(sum);
        System.out.println("Average of numbers = " + averge);







        ArrayList<String> color = new ArrayList<String>();
        // Adding some color buy add method of
        //array list.
        // Create a hashset of integer.
        color.add("Red");
        color.add("java");
        color.add("black");
        color.add("Red");
        color.add("Pink");
        color.add("Viper");
        color.add("green");
        System.out.println(color);
        /* adding the comment */ 
        color.forEach((j) -> System.out.print(j));



    }

}

import java.util.Scanner;

public class latinpig {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value");
        String latin = sc.nextLine();

        String pig;
        //System.out.println("A");
        pig = latin.substring(1, 5);
        System.out.println(" LatinPig = " + pig + latin.charAt(0) + "ay");


    }
}


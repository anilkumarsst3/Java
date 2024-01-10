import java.util.Scanner;

public class GradeCalculter {
    public static void main(String[] args) {
        double hindi, english, math,average;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hindi marks");
        hindi=sc.nextDouble();
        System.out.println("enter engllish marks");
        english=sc.nextDouble();
        System.out.println("enter math marks");
        math=sc.nextDouble();

        average=(hindi+english+math)/3;
        System.out.println(average);
        if(average>0&&average<=59){
            System.out.println("F");
        } else if (average>59&&average<=69) {
            System.out.println("D");
        } else if (average>=70&&average<=79) {
            System.out.println("C");
        } else if (average>80&&average<=89) {
            System.out.println("B");
        } else if (average>=90&&average<=100) {
            System.out.println("A");
        }
 else {
            System.out.println("please enter below 100");
        }
    }
}
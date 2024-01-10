public class AsciiCode {
    public static void main(String[] args) {
        int n = 10;
        int ascii = (int) n;
        System.out.println("\r" + ascii);


        for (int i = 1; i <= 10; i++) {
            System.out.println("24 * " + i + "=\t\t" + (24 * i));
            // ascii value of h
            char ch = 'h';
            System.out.println(((int) 'h'));// 104.

            // same way for letter Z;
            System.out.println((int) 'Z');
        }
        //add 3 to ascii value of d and print equavelent char

        int x = 3 + 'd';
        System.out.println((char) x);

        int num1=23;
        int num2=45;
        if(num1-num2==0){

            System.out.println("It is equall");
        }
        else {
            System.out.println("Not equal");
        }
        int result=0;
        int base=5;
        int power=7;
        for(int j=0;j<8;j++){
            result=base*j;


        }
        System.out.println(result);
        }





}



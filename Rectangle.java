import java.util.*;

public class Rectangle{
    public static void main(String[] args) {

       for(int i=1;i<6;i++){
           for(int j=5;j>=i;j--){
               System.out.print(" +");
           }
           System.out.println("  ");
       }
        String s = "Anil";
       String rev="";
       for(int i=s.length()-1;i>=0.;i--){
        rev=rev+s.charAt(i);

       }
        System.out.println(rev);

    }

    }

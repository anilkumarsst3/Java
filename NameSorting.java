import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NameSorting{
    public static void main(String[] args) {
        String[] names = {"john", "Amit", "sham", "waz","roza"};
        for(int i=0;i<names.length;i++){


        }
        System.out.println(names[0]);

     Arrays.sort(names, Collections.reverseOrder());
        System.out.println(Arrays.toString(names));
 /*     *//*or (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].compareTo(names[j]) > 0) {
                    String  temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;


                }



            }

        }*//*  f*/


    }
}
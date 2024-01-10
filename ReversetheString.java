public class ReversetheString {

    public static void main(String[] args) {

      /*  String str = "today10is20my30interview";
        //result: yadot10si20ym30weivretni;
        String rev = "";
        int l = str.length();
        System.out.println(l);
        String output=str.toUpperCase();
        System.out.println(output);*/
        /*char ch= str.charAt();
        for (int i=;i<5;i++){

            String reverse= str.charAt(i);
        }*/
      int c=500,d=100;

        ReversetheString obj = new ReversetheString();
        // calling method
        int result = obj.addNumbers(c, d);
        System.out.println("Sum is: " + result);


    }

    // create an object of Main


    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;

    }
}
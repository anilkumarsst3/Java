public class StaticvsNon_Static {
    static int gear;
    String car_name;
    public  static void main(String[] args){

        System.out.println(gear());
        StaticvsNon_Static h = new StaticvsNon_Static();

        System.out.println( h.getCar_name("ford"));

        }
        public static int gear(){
        return 6;

        }
        public String getCar_name(String name){
        this.car_name=name;
        return name;

        }


    }









public class inheretance2 {

    String name;
    int age;
    int phone_number;
    String add;
    double salary;
}

class Employee extends inheretance2 {

    String specialization;


}

class Manager extends Employee {


    String department;

    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mg= new Manager();
        emp.name="anil";
        emp.age=25;
        emp.phone_number=4533534;
        emp.add="455 high street";
        emp.salary=665;
        emp.specialization="IT";
        System.out.println("Emp name "+emp.name+ "\n" +"Age "+emp.age+"\n"+"phone number "
        +emp.phone_number+"\n"+"emp add "+emp.add+"\n"+"empsalary "+ emp.salary+"\n"+"Special "+emp.specialization);



    }


}
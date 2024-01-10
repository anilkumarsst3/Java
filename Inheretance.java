import org.w3c.dom.ls.LSOutput;

public class Inheretance {

    private void parent() {
        System.out.println("This is parent class");
    }

}

class child extends Inheretance {

    public void child() {
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        Inheretance in = new Inheretance();
        child ch = new child();
        //in.parent();//Since the parent class method is private it can't
        // be access.
        ch.child();
        //ch.parent();// parent class method is private so  it can't be accessed.



    }


}


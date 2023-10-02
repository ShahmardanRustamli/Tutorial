package dry_example;

public class DryExample {
    public void sayHello(){
        System.out.println("Hello Customer!");
    }
    public void welcome(){
        System.out.println("Welcome Customer");
    }
    public void login(){
        sayHello();
        welcome();
    }
}

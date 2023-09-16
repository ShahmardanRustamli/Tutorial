package hashcode_example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("rustamli");
        Student student1 = new Student("rustamli");

        System.out.println(student.hashCode());  //hascodeni override etdiyimiz ucun bunlar beraber olur
        System.out.println(student1.hashCode());
        System.out.println(student.hashCode() == student1.hashCode()); //true
    }
}

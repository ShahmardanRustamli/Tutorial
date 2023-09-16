package equals_example;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Fruit fruit1 = new Fruit();

        System.out.println(fruit == fruit1);  // burada obyeklerin equals`ini yoxlayiriq
        System.out.println(fruit.equals(fruit1)); // bu shekilde obyektleri yoxlayiriq.
    }

}



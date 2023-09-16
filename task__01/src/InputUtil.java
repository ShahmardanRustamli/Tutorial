import java.util.Scanner;

public class InputUtil {
    public static String inputString(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        return sc.nextLine();
    }

    public static int inputInt(String title){
        Scanner sc= new Scanner(System.in);
        System.out.println(title);
        return sc.nextInt();
    }
}

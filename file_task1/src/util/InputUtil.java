package util;

import java.util.Scanner;

public class InputUtil {

    public int inputInt(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextInt();
    }

    public String inputString(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextLine();
    }

    private InputUtil(){

    }
    private static InputUtil instance;
    public static InputUtil getInstance(){
        return instance == null? instance = new InputUtil(): instance;
    }


}
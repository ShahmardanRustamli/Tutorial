package util;

import javax.swing.*;
import java.util.Scanner;

public class InputUtil {



    private static InputUtil instance;

    public static InputUtil getInstance(){
       return instance == null ? instance = new InputUtil() : instance;
    }

    private InputUtil(){

    }
    public int inputInt(String title){
        Scanner input = new Scanner(System.in);
        System.out.println(title);
        return input.nextInt();
    }
    public String inputString(String title){
        Scanner input = new Scanner(System.in);
        System.out.println(title);
        return input.nextLine();
    }

    public double inputDouble(String title){
        Scanner input = new Scanner(System.in);
        System.out.println(title);
        return input.nextDouble();
    }
}

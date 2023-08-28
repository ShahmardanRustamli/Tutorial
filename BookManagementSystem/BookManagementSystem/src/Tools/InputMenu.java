package Tools;

import java.util.Scanner;

public class InputMenu {
    public static int inputInt(String title) {
        Scanner scr = new Scanner(System.in);
        System.out.println(title);
        return scr.nextInt();
    }
    public static String inputString(String title ){
        Scanner scr1 = new Scanner(System.in);
        System.out.println(title);
        return scr1.nextLine();
    }

}

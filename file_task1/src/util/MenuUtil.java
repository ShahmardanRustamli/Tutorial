package util;

import java.util.Scanner;

import static enums.Options.ADD;
import static enums.Options.PLAY;
import static enums.Options.EXIT;
import static enums.Options.SHOW;

public class MenuUtil {
    public int menuEntry(){
        System.out.print(
                PLAY.getMessage()+
                SHOW.getMessage()+
                ADD.getMessage()+
                EXIT.getMessage()
        );

        return InputUtil.getInstance().inputInt("Choose Option:");
    }

    private MenuUtil(){

    }

    private static MenuUtil instance;
    public static MenuUtil getInstance(){
        return instance == null? instance=new MenuUtil(): instance;
    }
}

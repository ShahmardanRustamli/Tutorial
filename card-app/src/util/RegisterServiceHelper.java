package util;

import model.entity.User;

public class RegisterServiceHelper {
    public static int countIndex;
    public static long id;

    public static User fillUser(){
         String name = InputUtil.getInstance().inputString("Enter the name");
         String surname = InputUtil.getInstance().inputString("Enter the surname");
         String username = InputUtil.getInstance().inputString("Enter the username");
         String password = InputUtil.getInstance().inputString("Enter the password");
         String fin = InputUtil.getInstance().inputString("Enter the Fin");
         String phoneNumber = InputUtil.getInstance().inputString("Enter the phone number");
        return new User(++id, name,surname,username,password,fin,phoneNumber);
    }
}

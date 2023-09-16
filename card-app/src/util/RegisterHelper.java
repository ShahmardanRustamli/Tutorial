package util;

import data.GlobalData;
import model.entity.User;

import static util.RegisterServiceHelper.countIndex;
import static util.RegisterServiceHelper.fillUser;

public class RegisterHelper {


    public static void userHelper(){
        User user = fillUser();
        if (user != null){
            GlobalData.users[countIndex] = user;
            countIndex++;
        }
    }

}

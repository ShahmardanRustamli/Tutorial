package service.impl;

import data.GlobalData;
import exception.ApplicationException;
import model.entity.User;
import model.enums.Exceptions;
import service.CardManagementService;
import service.CardManagementServiceImpl;
import service.UserService;
import util.InputUtil;
import util.MenuUtil;

import static util.RegisterHelper.userHelper;

public class UserServiceImpl implements UserService {
    private CardManagementService cardService;
    public UserServiceImpl(){
        cardService = new CardManagementServiceImpl();
    }

    @Override
    public void register() {
        int count = InputUtil.getInstance().inputInt("How many user register?");
        if (GlobalData.users == null){
            GlobalData.users = new User[count];
            for (int i = 0; i < GlobalData.users.length; i++) {
                userHelper();
            }
        }else {
            User[] tempUser = GlobalData.users;
            GlobalData.users = new User[GlobalData.users.length+count];
            for (int i = 0; i < tempUser.length; i++) {
                if (i<tempUser.length){
                    GlobalData.users[i] = tempUser[i];

                }else {
                    userHelper();
                }
            }
        }

    }

    @Override
    public void fillUser() {
        userHelper();
    }

    @Override
    public void login() {
        int option = MenuUtil.getInstance().entryMenu();

        String phoneNumberOrFin = InputUtil.getInstance()
                .inputString("Enter phone or fin").toUpperCase();

        String password = InputUtil.getInstance()
                .inputString("Enter password");

        boolean userDoesntExist = true;
        int failedAttempts = 0;
        for (User user: GlobalData.users){
            if (user.getFin().equals(phoneNumberOrFin) ||
            user.getPhoneNumber().equals(phoneNumberOrFin)){
                userDoesntExist = false;
                if (user.getPassword().equals(password)){
                    cardService.cardManagement(user.getId());
                }else {
                    failedAttempts++;
                }
            } if (failedAttempts == 3){
                System.exit(1);
            }
        }
        if (userDoesntExist){
            throw new ApplicationException(Exceptions.USERNAME_NOT_FOUND_EXCEPTION);
        }
    }
}

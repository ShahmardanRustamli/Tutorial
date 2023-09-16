package service;

import exception.ApplicationException;
import service.impl.CardServiceImpl;
import service.impl.UserServiceImpl;
import util.MenuUtil;

public class UserManagementServiceImpl implements UserManagementService {
    @Override
    public void userManagement() {
        UserService userService = new UserServiceImpl();

        try {
            int option = MenuUtil.getInstance().entryMenu();
            while (true) {
                switch (option) {
                    case 0:
                        System.exit(-1);
                        break;
                    case 1:
                        userService.fillUser();
                        break;
                    case 2:
                        userService.login();
                        break;
                    default:
                        System.out.println("Invalid Option!");

                }
            }
        } catch (ApplicationException exception) {
            System.out.println(exception.getMessage());
        }catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }
}
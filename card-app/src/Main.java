import service.UserManagementService;
import service.UserManagementServiceImpl;
import service.UserService;
import service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        new UserManagementServiceImpl().userManagement();
    }
}

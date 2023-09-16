package service.management;

import enums.Options;
import service.GameService;
import service.GameServiceImpl;
import util.MenuUtil;

public class IManagementService implements ManagementService{
    private GameService gameService;

    public IManagementService(){
        gameService = new GameServiceImpl();
    }
    @Override
    public void management() {
        while (true){
            int option = MenuUtil.getInstance().menuEntry();
            switch (option){
                case 0:
                System.exit( -1);
                break;
                case 1:
                gameService.add();
                case 2:
                gameService.play();
                 break;
                case 3:
                 gameService.show();
                 break;
                default:
                System.out.println("Invalid Choice!");
            }
        }
    }
}

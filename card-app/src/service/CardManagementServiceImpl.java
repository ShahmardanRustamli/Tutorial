package service;

import service.impl.CardServiceImpl;
import service.impl.UserServiceImpl;
import util.MenuUtil;

public class CardManagementServiceImpl implements CardManagementService{
    @Override
    public void cardManagement(long userId ) {
        CardService cardService = new CardServiceImpl();

        while (true){
            int option = MenuUtil.getInstance().entryMenu();

            switch (option){
                case 0:
                    System.exit(-1);
                    break;
                case 1:
                    cardService.cardToCard(userId);
                    break;
                case 2:
                    cardService.showBalance(userId);
                    break;
                default:
                    System.out.println("Invalid Option!");

            }
        }

    }

}

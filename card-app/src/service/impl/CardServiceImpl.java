package service.impl;

import data.GlobalData;
import exception.ApplicationException;
import model.entity.Card;
import model.entity.User;
import model.enums.Exceptions;
import service.CardService;
import util.InputUtil;
import util.MenuUtil;

public class CardServiceImpl implements CardService {

    @Override
    public void cardToCard(long id) {
        String receiverCard = InputUtil.getInstance().inputString("Enter receiver`s card number:");
        double transferMoney = InputUtil.getInstance().inputDouble("Transfer money:");

        User senderAccount = new User();
        User receiverAccount = new User();
        for (User user : GlobalData.users){
            if (user.getId() == id) {
                senderAccount = user;

                if (user.getCard().getAmount() < transferMoney + fee(transferMoney)){
                    throw new ApplicationException(Exceptions.INSUFFISICENT_BALANCE_EXCEPTION);
                }
            }
            if (user.getCard().getCardNumber().equals(receiverCard)){
                receiverAccount = user;
            }
        }

        changeBalance(senderAccount.getCard(), true, transferMoney);
        changeBalance(receiverAccount.getCard(), false, transferMoney);

    }

    @Override
    public void showBalance(long id) {
        for (User user : GlobalData.users){
            if (user.getId() == id) {
                System.out.println("-----------------------------");
                System.out.println("Dear customer, your balance:"
                        + user.getCard().getAmount());
                System.out.println("-----------------------------");
            }
        }
    }
    private void changeBalance(Card card,boolean isSender, double transferMoney){
        double newAmount = isSender ? card.getAmount() - transferMoney - fee(transferMoney) : card.getAmount() + transferMoney;
        card.setAmount(newAmount);
    }

    private double fee(double transferMoney) {
        return transferMoney/100 - 1;
    }
}

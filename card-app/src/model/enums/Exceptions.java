package model.enums;

public enum Exceptions {
    USERNAME_NOT_FOUND_EXCEPTION("Username does not exist!"),
    INSUFFISICENT_BALANCE_EXCEPTION("Insufficient balance!");

    private final String message;

    Exceptions(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

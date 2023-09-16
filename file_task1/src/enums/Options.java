package enums;

public enum Options {
    PLAY(1, "[1]. Play\n"),
    SHOW(1, "[2]. Show\n"),
    ADD(3, "[3]. Add\n"),
    EXIT(4, "[0]. Exit\n");

    private final int option;
    private final String message;
    Options(int option, String message){
        this.option = option;
        this.message = message;

    }

    public int getOption() {
        return option;
    }

    public String getMessage() {
        return message;
    }
}

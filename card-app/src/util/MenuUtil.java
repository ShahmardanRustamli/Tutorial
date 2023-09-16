package util;
public class MenuUtil {

    private MenuUtil(){

    }
    private static MenuUtil instance;

    public static MenuUtil getInstance() {
        return instance == null? instance = new MenuUtil() : instance;
    }

    public int entryMenu(){
        System.out.println("[0] - > System exit\n"+
                         "[2] - > Register\n"+
                         "[2] - > Login\n");
        return InputUtil.getInstance().inputInt("Choose option:");
    }

    public int accountMenu(){
        System.out.println("[1] - > Card to Card\n"+
                           "[2] - > Show Balance\n");

        return InputUtil.getInstance().inputInt("Choose option:");
    }
}

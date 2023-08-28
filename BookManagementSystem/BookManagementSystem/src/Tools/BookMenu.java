package Tools;

public class BookMenu {
    public static int Menu(){
        System.out.println(
                "[1]. Show Books\n"+
                "[2]. Search Book\n"+
                "[3]. Add Book\n"+
                "[4]. Update Books\n");
        return InputMenu.inputInt("Choose Option:");

    }
}

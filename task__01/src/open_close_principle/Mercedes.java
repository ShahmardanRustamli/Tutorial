package open_close_principle;

public class Mercedes extends Car {
    @Override
    public void Petrol(String type) {
        super.Petrol(type);
        System.out.println("Mercedes:" + type);
    }
}

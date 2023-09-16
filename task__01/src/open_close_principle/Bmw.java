package open_close_principle;

public class Bmw extends Car{
    @Override
    public void Petrol(String type) {
        super.Petrol(type);
        System.out.println("BMW:" + type);
    }
}

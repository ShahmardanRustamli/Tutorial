package open_close_principle;

public class Main {
    public static void main(String[] args) {
        Car car = new Bmw();
        Car car1 = new Mercedes();

        String type = "Benzin";
        String type1 = "Dizel";

        car.Petrol(type);
        car1.Petrol(type1);
    }


}

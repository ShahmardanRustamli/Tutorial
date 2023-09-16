package builder;

public class Main {
    public static void main(String[] args) {

        CoffeeShop coffeeShop = new CoffeeShop.CoffeeShopBuilder("Cappuccino")
                .milk(true)
                .syrup("Cream")
                .sugar(false)
                .build();


    }
}

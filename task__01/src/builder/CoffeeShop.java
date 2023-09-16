package builder;

public class CoffeeShop {
    private String coffee;
    private int size;
    private String syrup;
    private boolean milk;
    private boolean sugar;

    private CoffeeShop(CoffeeShopBuilder coffeeShopBuilder){
        this.coffee =coffeeShopBuilder.coffee;
        this.size = coffeeShopBuilder.size;
        this.syrup = coffeeShopBuilder.syrup;
        this.milk = coffeeShopBuilder.milk;
        this.sugar = coffeeShopBuilder.sugar;
    }

    public CoffeeShop(){

    }

    public static class CoffeeShopBuilder {
        private String coffee;
        private int size;
        private String syrup;
        private boolean milk;
        private boolean sugar;

        public CoffeeShopBuilder(String coffee){
            this.coffee = coffee;
        }

        public CoffeeShopBuilder size(int size){
            this.size = size;
            return this;
        }
        public CoffeeShopBuilder syrup(String syrup){
            this.syrup = syrup;
            return this;
        }
        public CoffeeShopBuilder milk(boolean milk){
            this.milk = milk;
            return this;
        }
        public CoffeeShopBuilder sugar(boolean sugar){
            this.sugar = sugar;
            return this;
        }

        public CoffeeShop build(){
            return new CoffeeShop(this);
        }

}
    public CoffeeShop(String coffee, int size) {
        this.coffee = coffee;
    }

    public CoffeeShop setCoffee(String coffee) {
        this.coffee = coffee;
        return this;
    }

    public CoffeeShop setSize(int size) {
        this.size = size;
        return this;
    }

    public CoffeeShop setSyrup(String syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeShop setMilk(boolean milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeShop setSugar(boolean sugar) {
        this.sugar = sugar;
        return this;
    }
}
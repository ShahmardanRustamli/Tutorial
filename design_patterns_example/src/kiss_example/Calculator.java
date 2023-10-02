package kiss_example;

public class Calculator {
    public int topla(int reqem, int reqem2){
        return reqem + reqem2;
    }
    public int vur(int reqem, int reqem2){
        return reqem * reqem2;
    }

    public class UseCalculator{
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int netice = calculator.topla(10,5);
            System.out.println(netice);
        }
    }
}

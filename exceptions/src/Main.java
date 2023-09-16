public class Main {
    static void myMethod() {
        myMethod2();
    }

    static void myMethod2(){    // bu app run olduqda StackOverFlow xetasi verecek cunki bir methodun ishi bitdikden sonra sonlanir
        myMethod();             // ve burada biz method icinde method yaratdigimiz uchun her defe stack`a yuklenir ve dolduqda app dayanir..

    }

    public static void main(String[] args) {
        myMethod();
    }
}

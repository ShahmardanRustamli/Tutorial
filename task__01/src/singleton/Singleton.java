package singleton;

public class Singleton {
    // Singleton pattern design`i biz burada okyekti bir defe
    // yaratmaq uchun istifade edirik
    private Singleton(){
        System.out.println("Obyekt bir defe yaradildi.");

    }
    private static Singleton instance = null;

    public static Singleton getInstance() {
        return instance ==null? instance = new Singleton():instance;
    }
}

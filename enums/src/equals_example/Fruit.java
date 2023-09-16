package equals_example;

public class Fruit {
    public static void main(String[] args) {  // burada String`lerin equalsini yoxlayiriq
        String str="Alma";
        String str1="Alma";
        String s2=new String("Alma"); // yeni string yaratsaq bele deyerleri yoxladigimiz ucun true aliriq
        String str3 = "Banan";
        System.out.println(str.equals(str1));//true
        System.out.println(str.equals(str1));//true
        System.out.println(str3.equals(str1));//false // str3 deyeri ferqli oldugu ucun false aliriq
        System.out.println(str==str1); //true
    }
}

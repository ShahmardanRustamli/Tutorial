public class User {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println(a/b);
        //  eger bunu run etsek ArithmeticException(Runtime exception)alacayiq bu bir riyazi xetadir
        //  // cunki 0-a bolmek olmur ve bunun ucun riyazi xeta aliriq

        int c = 10;
        int d = 5;
        System.out.println(c+ " - "+d+"="+c+d); // eger bunu run etsek mentiq xetasi olacaq bu xeta run olur
                                               // lakin yene de app ishleyir


        try{
            System.out.println(a/b);     // try-catch ile xeta atacaq hissleri ozumuz daxil ederek yoxlayiriq.
                                        // Exceptionlari bu vasite ile yoxlaya bilirik
        }catch (ArithmeticException exception){
            System.out.println("0-a bolme yoxdur!"); // xeta bash verdikde bu konsolda partlamir app ishleyir ve novbeti koda dushur.
        } finally {
            System.out.println(a+b);
            // finally mentiqi ise xetani tapdiqda yaziriq bu kod her teqdirde ishleyir
        }  // finally vermesek biz burda birden cox catch verib yoxlaya bilerik buna Multicatch deyilir.



        // 1.StackOverFlow xetasi, stackda yer qalmadiqda verilen xetadir.
        // 2.ArithmeticalException riyazi xetalarda verilir.
        // 3.ArrayOutOfBoundException mueyyen bir uzunlugun ve ya neqativ indexlere catmaq isteyende atilan xeta.

        // Exception ve Error ferqi, Exceptionlar checked ve unchecked olur bunlardan Runtime olanlari Unchecked
        // digerleri ise Checked olur.
        // Errorlar JVM veya Memoryden qaynaqlanir lakin Exception (istisnalar) istifadeci terefinden..

    }

}

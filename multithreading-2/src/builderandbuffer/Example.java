package builderandbuffer;

public class Example {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // Thread-safe deyil amma suretlidir.
        StringBuffer buffer = new StringBuffer();//Thread-safe`dir arxada Synchronize ishleyir.

        builder.append("test1-")
                .append("test2-")
                .append("test3.");
        System.out.println(builder);

        buffer.append(1)
                .append(2)
                .append(3);
        System.out.println(buffer);

    }
}

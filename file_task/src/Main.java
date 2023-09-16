import fileUtil.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileReaderService fileReaderService = new FileReaderServiceImpl();
        FileWriterService fileWriterService = new FileWriterServiceImpl();
        fileWriterService.writeWithOutputStream("testoutput", "testdata");
        fileWriterService.writerWriter("text.txt", "written!");
        fileReaderService.readWithBytes("text.txt");
        fileWriterService.printStream();
        fileWriterService.printWriter();


        File file = new File("testfile.out");
        OutputStream outputStream = new FileOutputStream(file); //Oxumaq uchun istifade edirik.
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        Employee employee = new Employee("Name" , "Surname", 100000);
        objectOutputStream.writeObject(employee);

        InputStream inputStream = new FileInputStream(file); // yazmaq uchun istifade edirik.
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Employee employee1 = (Employee) objectInputStream.readObject();
        System.out.println(employee1);
    }
}

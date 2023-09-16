package fileUtil;

import java.io.*;

public class FileWriterServiceImpl implements FileWriterService{
    @Override
    public void writerWriter(String filePath, String data) {
        File file = new File(filePath);

        try {
            if(!file.exists()) {
                System.out.println("File created");
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file, true);
            writer.write(data);
            writer.close();

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void writeWithOutputStream(String filePath, String data) {
        File file = new File(filePath);
        try {
            if(!file.exists()) {
                System.out.println("File created");
                file.createNewFile();
            }


            FileOutputStream fileOutputStream = new FileOutputStream(file);   //Byte`ler le ishlemek uchun FileOutputStream ishlediri.
            fileOutputStream.write("write test data with bytes".getBytes());  //Byte`ler ile vermek uchun.
            fileOutputStream.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }

    @Override
    public void printStream() {
        File file = new File("text.txt");
        try {
            PrintStream printStream = new PrintStream(file);
            printStream.println("test");
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }

    @Override
    public void printWriter() {
        File file = new File("test123");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("test");
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}

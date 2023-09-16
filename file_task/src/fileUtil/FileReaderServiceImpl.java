package fileUtil;

import java.io.*;

public class FileReaderServiceImpl implements FileReaderService {

    @Override
    public void readWithReader(String filePath) {
        File file = new File(filePath);

        if(!file.exists()){
            System.out.println("File does not exist!");
            return;
        }
        try {
            FileReader fileReader = new FileReader(file);
            int c;
            String str = "";
            while ((c= fileReader.read()) !=-1){
                String str2 = "";
                str2 = str.concat(String.valueOf((char)c));
                System.out.println(str2);         //capa veririk.

            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void readWithBytes(String filePath) {
        File file = new File(filePath);

        if(!file.exists()){
            System.out.println("File does not exist!");
        }
        try {
            InputStream inputStream = new FileInputStream(file);
            int c;
            byte[] bytes = new byte[(int) file.length()];
            inputStream.readAllBytes();
            while ((c = inputStream.read())!=-1){
                System.out.println(c);

            }
        }catch (IOException exception){
            exception.printStackTrace();
        }

    }

    @Override
    public void readWithInputStream(String filePath, String data) {
        File file = new File(filePath);
        if(!file.exists()){
            System.out.println("File created");
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(data.getBytes());
            bufferedOutputStream.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
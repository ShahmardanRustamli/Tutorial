package fileUtil;

public interface FileWriterService {
    void writerWriter(String filePath, String data);
    void writeWithOutputStream(String filePath, String data);

    void printStream();

    void printWriter();
}

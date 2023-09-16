package fileUtil;

public interface FileReaderService {
    void readWithReader(String filePath);

    void readWithBytes(String filePath);

    void readWithInputStream(String filePath, String data);
}

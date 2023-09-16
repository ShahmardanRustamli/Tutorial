package service;

import model.Word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileServiceImpl implements FileService{
    Path filePath = Paths.get("/files/word.txt");

    @Override
    public Word[] readFile() {
        try{
            byte[] bytes = Files.readAllBytes(filePath);
            String[] keysAndValues = new String(bytes).split(" - \n");
            Word[] words = new Word[keysAndValues.length];
            for (int i = 0; i < words.length; i++) {
                String[] keyAndValue = keysAndValues[i].split("-");
                words[i] = new Word(keyAndValue[0], keyAndValue[1]);
            }
            return words;
        }catch (IOException exception){
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean writeFile(Word word) {
        if (Files.exists(filePath)){
            createDirectoryAndFile();
        }
        try {
            Files.writeString(filePath, word.getKeyValue());
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return false;
    }

    private void createDirectoryAndFile(){
        Path directory = Paths.get("/files/");
        try {
            Files.createDirectory(directory);
            Files.createFile(filePath);

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}

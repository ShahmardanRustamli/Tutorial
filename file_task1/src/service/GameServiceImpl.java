package service;

import model.Word;
import util.InputUtil;
import util.RandomUtil;

public class GameServiceImpl implements GameService{
    private FileService fileService;

    public GameServiceImpl(){
        fileService = new FileServiceImpl();

    }
    @Override
    public void play() {
        int point =0;
        Word[] words = fileService.readFile();
        for (int i = 0; i < 10; i++) {
            int randomIndex = RandomUtil.getInstance().getRandomIndex(words.length);

            if (words[randomIndex].isShowed()){
                i--;
            } else {
                if (isAnswerTrue(words[randomIndex])){
                    words[randomIndex].setShowed(true);
                    point++;
                }
            }

        }
        System.out.println(""+point);
    }
    @Override
    public void show() {
        Word[] words = fileService.readFile();
        System.out.println("-------------| Words |----------------");
        for (Word word : words){
            System.out.println(word.getKeyValue());
        }
        System.out.println("-------------------------------");

    }

    @Override
    public void add() {
        String key = InputUtil.getInstance().inputString("ENG");
        String value = InputUtil.getInstance().inputString("AZE");
        boolean isAdd = fileService.writeFile(new Word(key,value));
        System.out.println(isAdd ? "Successfully": "Failed!");
    }
    private String playerAnswer(Word word){
        return InputUtil.getInstance().inputString(word.getKey() +":" );
    }
    private boolean isAnswerTrue(Word word){
        return playerAnswer(word).equals(word.getValue());
    }
}

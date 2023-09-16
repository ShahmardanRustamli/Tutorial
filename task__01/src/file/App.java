package file;

public class App {
    public static void main(String[] args) {
        FileExplorerFactory explorerFactory = new FileExplorerFactory();
        FileExplorer fileExplorer = explorerFactory.createFileExplorer(FileExplorerType.EXCEL);
        System.out.println(fileExplorer.fileGenerate("files"));
    }

}

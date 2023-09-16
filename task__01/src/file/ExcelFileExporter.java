package file;

public class ExcelFileExporter implements FileExplorer{
    @Override
    public String fileGenerate(String message) {
        return "EXCEL{" + message +"}" + ".xlsx" ;
    }
}

package file;

public class PdfFileExporter implements FileExplorer{
    @Override
    public String fileGenerate(String message) {
        return "PDF{" + message +"}" + ".pdf" ;

    }
}

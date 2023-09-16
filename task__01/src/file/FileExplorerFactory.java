package file;

import factory.IllegalNotificationTypeException;

public class FileExplorerFactory {
    public FileExplorer createFileExplorer(FileExplorerType type){
        switch (type){
            case EXCEL: return new ExcelFileExporter();
            case PDF: return new PdfFileExporter();
            default: throw new IllegalFormatTypeException("Illegal file format!"+ type);
        }
    }
}

interface DocumentReader{
    public ArrayList<String> read(String path);
}
class WordReader implements DocumentReader{
    public ArrayList<String> read(String path){
        // read word file with path of filled
        return null;
    }
}
class ExcelReader implements DocumentReader{
    public ArrayList<String> read(String path){
        //read word file with path of filled
        return null;
    }
}

class ReaderDecorator implements DocumentReader{
    private DocumentReader documentReader;

    public ReaderDecorator(DocumentReader documentReader){
        this.documentReader = documentReader;
    }

    public ArrayList<String> read(String path){
        documentReader.read(path);
        return null;
    }
}

class ReaderRot13Decorator extends ReaderDecorator{
    public ReaderRot13Decorator(DocumentReader documentReader) {
        super(documentReader);
    }

    public ArrayList<String> read(String path){
        ArrayList<String> contents = super.read(path);
        return null;
    }
}
class ReaderAtbashDecorator extends ReaderDecorator{
    public ReaderAtbashDecorator(DocumentReader documentReader) {
        super(documentReader);
    }

    public ArrayList<String> read(String path){
        ArrayList<String> contents = super.read(path);
        return null;
    }
}

class Example{
    public static void main(String[] args) {
        DocumentReader wordReader = new WordReader();
        DocumentReader excelReader = new ExcelReader();

        ReaderDecorator rot13Word = new ReaderRot13Decorator(wordReader);
        ArrayList<String> contents1 = rot13Word.read("path/.../.docx");

        ReaderDecorator rot13Excel = new ReaderRot13Decorator(excelReader);
        ArrayList<String> contents2 = excel13.read("path/.../.xlsx");

        ReaderDecorator atbashWord = new ReaderDecorator(wordReader);
        ArrayList<String> contents3 = atbashWord.read("path/.../.docx");

        ReaderDecorator atbashExcel = new ReaderDecorator(excelReader);
        ArrayList<String> contents4 = atbashExcel.read("path/.../.xlsx");
    }
}
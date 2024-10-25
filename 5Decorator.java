//Decorator
/*Connects behaviors to an object dynamically */

interface DocumentReader{
    // - //
    public ArrayList<String> read();
}

class WordReader implements DocumentReader{
    private String path;

    public void setPath(String path){
        this.path = path;
    }

    // - //
    public ArrayList<String> read(){
        // read Word file with path of filled
        return null;
    }
}
class ExcelReader implements DocumentReader{
    private String path;

    public void setPath(String path){
        this.path = path;
    }

    // - //
    public ArrayList<String> read(){
        // read Excel file with path of filled
        return null;
    }
}

class ReaderDecorator implements DocumentReader{
    private DocumentReader documentReader;

    public ReaderDecorator(DocumentReader documentReader){
        this.documentReader = documentReader;
    }

    // - //
    public ArrayList<String> read(){
        documentReader.read();
        return null;
    }
}

class ReaderRot13Decorator extends ReaderDecorator{
    public ReaderRot13Decorator(DocumentReader documentReader){
        super(documentReader);
    }

    // - //
    public ArrayList<String> read(){
        ArrayList<String> contents = super.read(path);
        // do decryption atBash
        // return the decrypted content
        return null;
    }
}
class ReaderAtbashDecorator extends ReaderDecorator{
    public ReaderAtbashDecorator(DocumentReader documentReader){
        super(documentReader);
    }

    // - //
    public ArrayList<String> read(){
        ArrayList<String> contents = super.read(path);
        // do decryption atbash
        // return the decrypted content
        return null;
    }
}


class Example{
    public static void main(String[] args){
        WordReader wordReader = new WordReader();
        ExcelReader excelReader = new ExcelReader();

        wordReader.setPath("path/.../.doc");
        ReaderRot13Decorator rot13Word = new ReaderRot13Decorator(wordReader);
        ArrayList<String> contents1 = rot13Word.read();

        excelReader.setPath("path/.../.xlsx");
        ReaderDecorator rot13Excel = new ReaderRot13Decorator(excelReader);
        ArrayList<String> contents2 = rot13Excel.read();

        wordReader.setPath("path/.../.doc");
        ReaderAtbashDecorator atbashWord = new ReaderAtbashDecorator(wordReader);
        ArrayList<String> contnents3 = atbashWord.read();

        wordReader.setPath("path/.../.xlsx");
        ReaderAtbashDecorator atbashExcel = new ReaderAtbashDecorator(wordReader);
        ArrayList<String> contnents4 = atbashExcel.read();
    }
}
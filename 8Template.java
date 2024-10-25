//Template
/* */
public class Word{
    private ArrayList<String> contents;
    private String statistics;

    public void calculateStatistics(String parth){
        contents = readWordFile(path);
        statistics = calculate();
        saveStatisticsToDisk();
    }

    public ArrayList<String> readWordFile(String path){
        //read word
        return null;
    }

    public String calculate(){
        //calculate statistics
        return null;
    }

    public void saveStatisticsToDisk(){
        //save statistics to disk
    }
}
public class Excel{
    private ArrayList<String> contents;
    private String statistics;

    public void calculateStatistics(String parth){
        contents = readExcelFile(path);
        statistics = calculate();
        saveStatisticsToDisk();
    }

    public ArrayList<String> readExcelFile(String path){
        //read excel
        return null;
    }

    public String calculate(){
        //calculate statistics
        return null;
    }

    public void saveStatisticsToDisk(){
        //save statistics to disk
    }
}

public class Example{
    public static void main(String[] args){
        Word word = new Word();
        word.calculateStatistics("path/.../.docx");

        Excel excel = new Excel();
        excel.calculateStatistics("path/.../.xlsx");
    }
}
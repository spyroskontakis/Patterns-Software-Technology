public abstract class Template{
    private ArrayList<String> contents;
    private String statistics;

    public void calculateStatistics(String parth){
        contents = readFile(path);
        statistics = calculate();
        saveStatisticsToDisk();
    }

    public String calculate(){
        //calculate statistics
        return null;
    }

    public void saveStatisticsToDisk(){
        //save statistics to disk
    }

    protected abstract ArrayList<String> readFile(String path);
}

public class Word extends Template{
    protected ArrayList<String> readFile(String path){
        //read word
        return null;
    }
}
public class Excel extends Template{
    protected ArrayList<String> readFile(String path){
        //read excel
        return null;
    }
}

public class Factory{
    public static Template create(String choice){
        if(choice.equalsto("Word"))
            return new Word();
        else
            return new Excel("Excel");
    }
}


public class Example{
    public static void main(String[] args){
        Template word = Factory.create("Word");
        word.calculateStatistics("path/.../.docx");

        Template excel = Factory.create("Excel");
        word.calculateStatistics("path/.../.xlsx");
    }
}
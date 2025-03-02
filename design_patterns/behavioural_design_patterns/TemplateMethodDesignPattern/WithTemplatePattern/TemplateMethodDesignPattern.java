package design_patterns.behavioural_design_patterns.TemplateMethodDesignPattern.WithTemplatePattern;

abstract class DataParser {
    // Template Method - Defines the steps of the algorithm
    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile() {
        System.out.println("Opening File");
    }

    protected void closeFile() {
        System.out.println("Closing File");
    }

    protected abstract void parseData();
}

class CSVParser extends DataParser {
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
    
}

class JSONParser extends DataParser {
    protected void parseData() {
        System.out.println("Parsing JSON Data");
    }
    
}

public class TemplateMethodDesignPattern {
    public static void main(String[] args) {
        DataParser jsonParser = new JSONParser();
        DataParser csvParser = new CSVParser();

        jsonParser.parse();
        csvParser.parse();
    }
}

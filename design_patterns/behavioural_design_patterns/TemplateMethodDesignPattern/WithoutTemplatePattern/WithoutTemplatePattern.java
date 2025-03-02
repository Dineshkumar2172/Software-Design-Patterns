package design_patterns.behavioural_design_patterns.TemplateMethodDesignPattern.WithoutTemplatePattern;

class CSVParser {
    public void parse() {
        openFile();
        // CSV specific parsing logic
        System.out.println("Parsing a CSV file");
        closeFile();
    }

    private void openFile(){
        System.out.println("Opening File");
    }

    private void closeFile(){
        System.out.println("Closing file");
    }
}

class JSONParser {
    public void parse() {
        openFile();
        // CSV specific parsing logic
        System.out.println("Parsing a JSON file");
        closeFile();
    }

    private void openFile(){
        System.out.println("Opening File");
    }

    private void closeFile(){
        System.out.println("Closing file");
    }
}

public class WithoutTemplatePattern {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse(); // parsing csv file
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse(); // parsing json file
    } 
}

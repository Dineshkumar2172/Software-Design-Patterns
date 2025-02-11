package unified_modeling_language_uml;

class Document {
    
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Printer {
    public void print(Document document){
        System.out.println(document.getContent());
    }
}

public class DependancyExample {
    public static void main(String[] args) {
        // This is a relationship where one calss relies on another class in some way, often through
        // method parameters, return types and temproary sociations.
        Document document = new Document("Dependancy example document");
        Printer printer = new Printer();

        // printer depends on document to print its content
        printer.print(document);
    }
}

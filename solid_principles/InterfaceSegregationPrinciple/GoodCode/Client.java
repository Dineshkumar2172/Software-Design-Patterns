package solid_principles.InterfaceSegregationPrinciple.GoodCode;

public class Client {
    public static void main(String[] args) {
        
        Document document = new Document(); // just a dummy document

        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(document);

        MultiPurposePrinter multiPurposePrinter = new MultiPurposePrinter();
        multiPurposePrinter.scan(document);
        multiPurposePrinter.copy(document);
        multiPurposePrinter.print(document);
    }
}

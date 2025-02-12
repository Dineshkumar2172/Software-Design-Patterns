package solid_principles.InterfaceSegregationPrinciple.BadCode;

public class SimplePrinter implements Machine{
    // assuming only job of simple printer is printing a document. It doesn't support copy or scan.
    // just because it's implementing Machine interface which has scan and copy in it, it's forced to define those functions.
    // it corresponds to Violation of ISP (Interface Segregation Principle) - it should be solved by splitting large
    // monolithic Machine Interface into three smaller interfaces.
    @Override
    public void print(Document document) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document document) {
        // simple printer doesn't support scan functionality
        throw new UnsupportedOperationException("Scan is not supported...");
    }

    @Override
    public void copy(Document document) {
        // simple printer doesn't support copy functionality 
        throw new UnsupportedOperationException("Copy is not supported...");
    }
    
}

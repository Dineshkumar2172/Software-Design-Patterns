package solid_principles.InterfaceSegregationPrinciple.GoodCode;

public class SimplePrinter implements MachinePrint{

    @Override
    public void print(Document document) {
        System.out.println("Printing document...");
    }
    
}

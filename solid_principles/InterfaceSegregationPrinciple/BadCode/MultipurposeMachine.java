package solid_principles.InterfaceSegregationPrinciple.BadCode;

public class MultipurposeMachine implements Machine {

    @Override
    public void print(Document document) {
        System.out.println("Printing document...");
    }

    @Override
    public void scan(Document document) {
       System.out.println("Scanning document...");
    }

    @Override
    public void copy(Document document) {
        System.out.println("Copying document...");
    }
    
}

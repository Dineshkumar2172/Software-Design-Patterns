package solid_principles.InterfaceSegregationPrinciple.BadCode;

public interface Machine {
    
    void print(Document document);

    void scan(Document document);

    void copy(Document document);

}

package solid_principles.LiskovSubstitutionPrinciple.GoodCode;

public class ReadableFile implements Readable{

    public void read() {
        System.out.println("reading from file...");
    }
    
}

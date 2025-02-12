package solid_principles.LiskovSubstitutionPrinciple.GoodCode;

public class WriteableFile extends ReadableFile  implements Writable{

    @Override
    public void write() {
        System.out.println("writing to a file...");
    }
    
}

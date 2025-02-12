package solid_principles.LiskovSubstitutionPrinciple.BadCode;

public class ReadOnlyFile extends File{
    public void write() {
        throw new UnsupportedOperationException("cannot write to a read only file");
    }
}

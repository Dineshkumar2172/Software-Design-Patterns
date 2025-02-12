package solid_principles.LiskovSubstitutionPrinciple.BadCode;

public class Client {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read(); // works fine
        file.write(); // will throw exception, violation of LSP
    }
}

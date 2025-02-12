package solid_principles.LiskovSubstitutionPrinciple.GoodCode;

public class Client {
    public static void main(String[] args) {
        Readable readableFile = new ReadableFile();
        readableFile.read();

        WriteableFile writableFile = new WriteableFile();
        writableFile.read();
        writableFile.write();

        readAnyFile(writableFile);
        readAnyFile(readableFile);
    }

    public static void readAnyFile(Readable file){
        file.read();
    }
}

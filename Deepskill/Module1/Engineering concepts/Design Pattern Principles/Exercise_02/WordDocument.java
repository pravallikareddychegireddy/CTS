// WordDocument.java - Concrete document type

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening a Word document (.docx)");
    }
}

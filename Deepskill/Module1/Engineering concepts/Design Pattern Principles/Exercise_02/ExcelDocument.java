// ExcelDocument.java - Concrete document type

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening an Excel document (.xlsx)");
    }
}

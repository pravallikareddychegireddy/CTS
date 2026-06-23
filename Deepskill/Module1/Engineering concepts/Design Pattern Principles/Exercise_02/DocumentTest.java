// DocumentTest.java - Factory Method Pattern Test
// Demonstrates creating different document types using their factories.

public class DocumentTest {

    public static void main(String[] args) {

        // Create different factories
        DocumentFactory wordFactory  = new WordDocumentFactory();
        DocumentFactory pdfFactory   = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        System.out.println("=== Document Management System ===");

        // Each factory creates and opens its specific document type
        wordFactory.openDocument();
        pdfFactory.openDocument();
        excelFactory.openDocument();
    }
}

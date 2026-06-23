// DocumentFactory.java - Abstract factory with the factory method

public abstract class DocumentFactory {

    // This is the factory method - subclasses will decide which Document to create
    public abstract Document createDocument();

    // Common method to open the created document
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}

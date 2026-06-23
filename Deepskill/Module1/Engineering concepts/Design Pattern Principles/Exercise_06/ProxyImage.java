// ProxyImage.java - Proxy Class
// Acts as a stand-in for RealImage. Loads it lazily (only when needed)
// and caches it so future calls don't reload from server.

public class ProxyImage implements Image {

    private String filename;
    private RealImage realImage;  // cached reference

    public ProxyImage(String filename) {
        this.filename = filename;
        // Note: we do NOT load the image here (lazy initialization)
    }

    @Override
    public void display() {
        // Load only if not already loaded (lazy init + caching)
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

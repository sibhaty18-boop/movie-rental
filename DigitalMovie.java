// Multiple Inheritance Restriction — use interfaces instead

interface Streamable {
    default void stream() {
        System.out.println("  Streaming online...");
    }
}

interface Downloadable {
    default void download() {
        System.out.println("  Downloading to device...");
    }
}

// Extends ONE class + implements TWO interfaces
class DigitalMovie extends Movie implements Streamable, Downloadable {

    public DigitalMovie(String title, double rentalPrice, String director) {
        super(title, rentalPrice, director);
        System.out.println("[DigitalMovie] Constructor.");
    }

    public void showOptions() {
        stream();
        download();
    }
}

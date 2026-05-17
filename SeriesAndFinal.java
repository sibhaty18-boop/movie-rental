// Multilevel Inheritance: Media -> Series -> EpisodeSeries

class Series extends Media {

    protected int seasons;

    public Series(String title, double rentalPrice, int seasons) {
        super(title, rentalPrice);
        this.seasons = seasons;
        System.out.println("[Series] Constructor. Seasons: " + this.seasons);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Seasons: " + seasons);
    }
}

class EpisodeSeries extends Series {

    private int totalEpisodes;

    public EpisodeSeries(String title, double rentalPrice, int seasons, int totalEpisodes) {
        super(title, rentalPrice, seasons);
        this.totalEpisodes = totalEpisodes;
        System.out.println("[EpisodeSeries] Constructor. Episodes: " + this.totalEpisodes);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Total Episodes: " + this.totalEpisodes);
    }

    public void showLevels() {
        System.out.println("  Grandparent field (title)   : " + super.title);
        System.out.println("  Parent field      (seasons) : " + super.seasons);
        System.out.println("  Own field (totalEpisodes)   : " + this.totalEpisodes);
    }
}

// final class — cannot be extended
final class SpecialMovie extends Movie {

    public SpecialMovie(String title, double rentalPrice, String director) {
        super(title, rentalPrice, director);
        System.out.println("[SpecialMovie] Constructor. This class is final!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  * This is a Special Edition release.");
    }

    // final method
    public final void playTrailer() {
        System.out.println("  Playing exclusive trailer for: " + title);
    }
}

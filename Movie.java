public class Movie extends Media {

    protected String director;

    public Movie(String title, double rentalPrice, String director) {
        super(title, rentalPrice);     // super() constructor call
        this.director = director;      // this keyword
        System.out.println("[Movie] Constructor: " + this.director);
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();           // super.method()
        System.out.println("  Director: " + director);
    }

    // super keyword accessing parent fields
    public void showParentInfo() {
        System.out.println("  Parent title (super.title): " + super.title);
        System.out.println("  Parent price (super.rentalPrice): $" + super.rentalPrice);
    }

    // Static method HIDING
    public static void rentalPolicy() {
        System.out.println("[Movie] Movie rental: 2 days only.");
    }
}
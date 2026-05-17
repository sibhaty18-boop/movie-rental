public class Media {

    protected String title;
    protected double rentalPrice;

    
    public Media() {
        this.title       = "Unknown";
        this.rentalPrice = 0.0;
        System.out.println("[Media] Default constructor called (implicit super() rule)");
    }

    // Parameterized constructor
    public Media(String title, double rentalPrice) {
        this.title       = title;
        this.rentalPrice = rentalPrice;
        System.out.println("[Media] Constructor: " + this.title);
    }

    // Regular method — subclasses can override
    public void displayInfo() {
        System.out.println("Title: " + title + " | Price: $" + rentalPrice);
    }

    // final method — NO subclass can override this
    public final void printReceipt() {
        System.out.println("--- Receipt: Rented '" + title + "' for $" + rentalPrice + " ---");
    }

    // Static method — will be HIDDEN by Movie
    public static void rentalPolicy() {
        System.out.println("[Media] Default rental: 3 days.");
    }
}
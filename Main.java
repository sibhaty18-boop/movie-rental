public class Main {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("       MOVIE RENTAL SYSTEM — Java OOP     ");
        System.out.println("===========================================\n");

        // 1. Single Inheritance + super() + this
        System.out.println(">>> 1. Single Inheritance");
        Movie movie = new Movie("Inception", 3.99, "Christopher Nolan");
        movie.displayInfo();
        System.out.println();

        // 2. super keyword (fields & methods)
        System.out.println(">>> 2. super Keyword");
        movie.showParentInfo();
        System.out.println();

        // 3. Hierarchical Inheritance + Method Overriding
        System.out.println(">>> 3. Hierarchical Inheritance & Method Overriding");
        ActionMovie action = new ActionMovie("Mad Max", 4.49, "George Miller", 35);
        Documentary doc    = new Documentary("Planet Earth", 2.99, "Attenborough", "Nature");
        System.out.println("-- Action Movie --");
        action.displayInfo();
        System.out.println("-- Documentary --");
        doc.displayInfo();
        System.out.println();

        // 4. Multilevel Inheritance
        System.out.println(">>> 4. Multilevel Inheritance");
        EpisodeSeries show = new EpisodeSeries("Breaking Bad", 5.99, 5, 62);
        show.displayInfo();
        show.showLevels();
        System.out.println();

        // 5. final Class + final Method
        System.out.println(">>> 5. final Class & final Method");
        SpecialMovie special = new SpecialMovie("The Godfather", 6.99, "Coppola");
        special.displayInfo();
        special.playTrailer();
        System.out.println();

        // 6. final method from superclass
        System.out.println(">>> 6. final Method (printReceipt)");
        action.printReceipt();
        System.out.println();

        // 7. Method Hiding (static)
        System.out.println(">>> 7. Method Hiding — Static Methods");
        Media.rentalPolicy();
        Movie.rentalPolicy();
        Media ref = new Movie("Dune", 3.99, "Villeneuve");
        ref.rentalPolicy();   // prints Media's version — proves hiding not overriding
        System.out.println();

        // 8. Multiple Inheritance Restriction
        System.out.println(">>> 8. Multiple Inheritance Restriction");
        DigitalMovie digital = new DigitalMovie("Interstellar", 4.99, "Nolan");
        digital.showOptions();
        System.out.println();

        // 9. Implicit super() Rule
        System.out.println(">>> 9. Implicit super() Rule");
        Media blank = new Media();
        blank.displayInfo();
        System.out.println();

        // 10. protected Access + Visibility
        System.out.println(">>> 10. protected Access Modifier");
        System.out.println("  title   : " + action.title);
        System.out.println("  director: " + action.director);
        System.out.println();

        System.out.println("===========================================");
        System.out.println("          All Topics Demonstrated!        ");
        System.out.println("===========================================");
    }
}
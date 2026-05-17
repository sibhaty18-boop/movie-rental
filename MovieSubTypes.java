// Hierarchical Inheritance — both extend Movie

class ActionMovie extends Movie {

    private int actionScenes;

    public ActionMovie(String title, double rentalPrice, String director, int actionScenes) {
        super(title, rentalPrice, director);
        this.actionScenes = actionScenes;
        System.out.println("[ActionMovie] Constructor. Scenes: " + this.actionScenes);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Action Scenes: " + this.actionScenes);
    }
}

class Documentary extends Movie {

    private String topic;

    public Documentary(String title, double rentalPrice, String director, String topic) {
        super(title, rentalPrice, director);
        this.topic = topic;
        System.out.println("[Documentary] Constructor. Topic: " + this.topic);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Topic: " + this.topic);
    }
}

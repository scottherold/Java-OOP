public class Project {
    // <----- Attributes ----->
    private String name;
    private String description;
    private double initialCost;

    // <----- Constructors ----->
    // Blank
    public Project() {

    }

    // Name only
    public Project(String name) {
        this.name = name;
    }

    // Name and Description
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // <----- Getters/Setters ----->
    // Name
    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Description
    // Getter
    public String getDescription() {
        return description;
    }

    // Setter
    public void setDescription(String description) {
        this.description = description;
    }

    // initialCost
    // Getter
    public double getInitialCost() {
        return initialCost;
    }

    // Setter
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    // <----- Instance Methods ----->
    public String elevatorPitch() {
        return this.name + " (" + this.initialCost + ") : " + this.description;
    }
}
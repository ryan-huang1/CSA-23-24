public class Cereal {

    // Instance variables
    private String name;
    private String type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private double fiber;
    private int carbohydrates;
    private int sugars;
    private int potassium;
    private int vitamins;
    private int shelf;
    private double weight;
    private double cups;
    private double rating;

    // Constructor
    public Cereal(String name, String type, int calories, int protein, int fat, int sodium, double fiber,
            int carbohydrates, int sugars, int potassium, int vitamins, int shelf, double weight,
            double cups, double rating) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugars = sugars;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating;
    }

    // Accessor methods (getters)
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public double getFiber() {
        return fiber;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getSugars() {
        return sugars;
    }

    public int getPotassium() {
        return potassium;
    }

    public int getVitamins() {
        return vitamins;
    }

    public int getShelf() {
        return shelf;
    }

    public double getWeight() {
        return weight;
    }

    public double getCups() {
        return cups;
    }

    public double getRating() {
        return rating;
    }

    // toString method
    @Override
    public String toString() {
        return "Cereal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", fiber=" + fiber +
                ", carbohydrates=" + carbohydrates +
                ", sugars=" + sugars +
                ", potassium=" + potassium +
                ", vitamins=" + vitamins +
                ", shelf=" + shelf +
                ", weight=" + weight +
                ", cups=" + cups +
                ", rating=" + rating +
                '}';
    }
}

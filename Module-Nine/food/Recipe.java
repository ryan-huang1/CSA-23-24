package food;

public class Recipe
{
    public Recipe(String theName)
    {
        String name = theName;
    }

    public void setServings(int x)
    {
        // some code
    }

    public double getRetailCost()
    {
        // ...some code
        int x = 13;
        double tempCost = pricePerCalorie(x) + calories + cost;
        return tempCost;
        // ...some more code
    }

    public double pricePerCalorie(int z)
    {
        // ...some code
        return 15.21;
    }

    public int calories;
    public int carbs;
    public int fat;
    private double cost;
}

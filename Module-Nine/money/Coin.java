package money;

import java.util.Random;

public class Coin {
    private String side;
    
    // Constructor
    public Coin() {
        // Initially, we can set the coin to heads or tails randomly.
        flip();
    }
    
    // Method to randomly flip the coin
    public void flip() {
        Random random = new Random();
        if (random.nextBoolean()) {
            side = "heads";
        } else {
            side = "tails";
        }
    }
    
    // Getter method for the side
    public String getSide() {
        return side;
    }
    
    // Setter method for the side
    public void setSide(String side) {
        this.side = side;
    }
}

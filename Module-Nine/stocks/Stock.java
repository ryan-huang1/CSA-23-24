package stocks;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private List<Double> purchasePrices;
    private List<Integer> purchaseShares;

    public Stock(String symbol) {
        this.symbol = symbol;
        this.purchasePrices = new ArrayList<>();
        this.purchaseShares = new ArrayList<>();
    }

    public void buy(int shares, double pricePerShare) {
        purchaseShares.add(shares);
        purchasePrices.add(pricePerShare);
    }

    public double sell(int shares, double sellingPrice) {
        double totalCost = 0;
        double totalShares = 0;

        // Calculate the total cost of the purchases
        for (int i = 0; i < purchasePrices.size(); i++) {
            totalCost += purchaseShares.get(i) * purchasePrices.get(i);
            totalShares += purchaseShares.get(i);
        }

        // Calculate the total revenue from selling
        double totalRevenue = shares * sellingPrice;

        // Calculate profit or loss
        double profitLoss = totalRevenue - totalCost;

        // Adjust for the number of shares sold vs bought
        if (totalShares > shares) {
            profitLoss *= (shares / totalShares);
        }

        return profitLoss;
    }

    // Getters
    public String getSymbol() {
        return symbol;
    }

    public List<Integer> getPurchaseShares() {
        return new ArrayList<>(purchaseShares); // Return a copy of the list to preserve encapsulation
    }

}

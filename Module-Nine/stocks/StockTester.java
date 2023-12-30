package stocks;

import java.util.Scanner;

public class StockTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first stock symbol:");
        String symbol1 = scanner.nextLine();
        Stock stock1 = new Stock(symbol1);
        processStockTransactions(scanner, stock1);

        System.out.println("Enter second stock symbol:");
        String symbol2 = scanner.nextLine();
        Stock stock2 = new Stock(symbol2);
        processStockTransactions(scanner, stock2);

        scanner.close();
    }

    private static void processStockTransactions(Scanner scanner, Stock stock) {
        System.out.println("How many purchases did you make?");
        int numberOfPurchases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPurchases; i++) {
            System.out.println("Purchase " + (i + 1) + ". How many shares and at what price/share?");
            String[] purchaseDetails = scanner.nextLine().split(" ");
            int shares = Integer.parseInt(purchaseDetails[0]);
            double price = Double.parseDouble(purchaseDetails[1]);
            stock.buy(shares, price);
        }

        System.out.println("Selling price:");
        double sellingPrice = Double.parseDouble(scanner.nextLine());

        int totalShares = stock.getPurchaseShares().stream().mapToInt(Integer::intValue).sum();
        double profitLoss = stock.sell(totalShares, sellingPrice);

        if (profitLoss > 0) {
            System.out.printf("Net profit: $%.2f\n", profitLoss);
        } else {
            System.out.printf("Net loss: $%.2f\n", Math.abs(profitLoss));
        }

    }
}

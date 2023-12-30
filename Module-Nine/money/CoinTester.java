package money;

public class CoinTester {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        Coin coin3 = new Coin();
        
        int flipCount = 0;
        while (!coin1.getSide().equals(coin2.getSide()) || !coin2.getSide().equals(coin3.getSide())) {
            coin1.flip();
            coin2.flip();
            coin3.flip();
            flipCount++;
            System.out.println("coin 1 is on " + coin1.getSide() + ", coin 2 is on " + coin2.getSide() + ", coin 3 is on " + coin3.getSide());
        }
        
        System.out.println("The coins were flipped a total of " + flipCount + " times.");
    }
}


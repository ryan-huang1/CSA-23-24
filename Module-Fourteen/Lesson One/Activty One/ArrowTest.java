public class ArrowTest {
    public static void main(String[] args) {
        LeftArrow leftArrow = new LeftArrow(5, 12, 7);
        RightArrow rightArrow = new RightArrow(5, 12, 7);

        System.out.println("Left Arrow:");
        leftArrow.drawAt(3); // Draw 3 lines down

        System.out.println("\nRight Arrow:");
        rightArrow.drawAt(3); // Draw 3 lines down
    }
}

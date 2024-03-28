public class LeftArrow extends Figure {
    private int tailLength;
    private int arrowWidth;

    public LeftArrow() {
        super();
        tailLength = 12; // Default values
        arrowWidth = 7;
    }

    public LeftArrow(int offset, int tailLength, int arrowWidth) {
        super(offset);
        this.tailLength = tailLength;
        setArrowWidth(arrowWidth); // This ensures the width is always odd.
    }

    public void setArrowWidth(int arrowWidth) {
        if (arrowWidth % 2 != 0) { // Ensure the width is odd
            this.arrowWidth = arrowWidth;
        } else {
            System.out.println("Arrow width must be an odd number. Width not set.");
        }
    }

    public int getArrowWidth() {
        return arrowWidth;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    // Draws the left-pointing arrow
    @Override
    public void drawHere() {
        int halfWidth = arrowWidth / 2;
        for (int i = 0; i < halfWidth; i++) {
            spaces(getOffset() + halfWidth - i);
            System.out.println("*");
        }

        spaces(getOffset());
        for (int i = 0; i < tailLength; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = halfWidth - 1; i >= 0; i--) {
            spaces(getOffset() + halfWidth - i);
            System.out.println("*");
        }
    }

    // Helper method to draw spaces
    private static void spaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(' ');
        }
    }
}

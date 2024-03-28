public class Box extends Figure {
    private int height;
    private int width;

    public Box() {
        super();
        height = 0;
        width = 0;
    }

    public Box(int newOffset, int newHeight, int newWidth) {
        super(newOffset);
        height = newHeight;
        width = newWidth;
    }

    public void drawHere() {
        drawHorizontalLine();
        drawSides();
        drawHorizontalLine();
    }

    private void drawHorizontalLine() {
        spaces(getOffset());
        for (int count = 0; count < width; count++)
            System.out.print('-');
        System.out.println();
    }

    private void drawSides() {
        for (int count = 0; count < (height - 2); count++)
            drawOneLineOfSides();
    }

    private void drawOneLineOfSides() {
        spaces(getOffset());
        System.out.print('|');
        for (int count = 2; count < width; count++)
            System.out.print(' ');
        System.out.println('|');
    }

    private static void spaces(int number) {
        for (int count = 0; count < number; count++)
            System.out.print(' ');
    }
}

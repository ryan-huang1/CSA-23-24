public class Figure {
    private int offset;

    public Figure() {
        offset = 0;
    }

    public Figure(int theOffset) {
        offset = theOffset;
    }

    public void setOffset(int newOffset) {
        offset = newOffset;
    }

    public int getOffset() {
        return offset;
    }

    public void drawAt(int lineNumber) {
        for (int count = 0; count < lineNumber; count++)
            System.out.println();
        drawHere();
    }

    public void drawHere() {
        for (int count = 0; count < offset; count++)
            System.out.print(' ');
        System.out.println('*');
    }
}

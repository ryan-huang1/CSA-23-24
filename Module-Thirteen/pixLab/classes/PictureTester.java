/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods. Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
  /** Method to test zeroBlue */
  public static void testZeroBlue() {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture beach = new Picture("beach.jpg"); // Adjust the filename as necessary
    beach.explore(); // Show the original picture
    beach.mirrorVerticalRightToLeft();
    beach.explore(); // Show the mirrored picture
  }

  public static void testMirrorHorizontal() {
    Picture beach = new Picture("beach.jpg"); // Adjust the filename as necessary
    beach.explore(); // Show the original picture
    beach.mirrorHorizontal();
    beach.explore(); // Show the mirrored picture
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple() {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test the collage method */
  public static void testCollage() {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection() {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture beach = new Picture("beach.jpg"); // Adjust the filename as necessary
    beach.explore(); // Show the original picture
    beach.mirrorHorizontalBotToTop();
    beach.explore(); // Show the mirrored picture
  }

  public static void testMirrorArms() {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore(); // Show the original picture
    snowman.mirrorArms();
    snowman.explore(); // Show the picture with all four arms
  }

  public static void testMirrorGull() {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore(); // Show the original picture
    seagull.mirrorGull();
    seagull.explore(); // Show the mirrored picture
  }

  /**
   * Main method for testing. Every class can have a main
   * method in Java
   */
  public static void main(String[] args) {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testMirrorHorizontal(); // Add this line to test the new method
    testMirrorVerticalRightToLeft(); // Add this line to test the new method
    testMirrorHorizontalBotToTop(); // Add this line to test the new method
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    // testMirrorDiagonal();
    // testCollage();
    // testCopy();
    // testEdgeDetection();
    // testEdgeDetection2();
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}
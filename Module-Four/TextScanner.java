import java.util.*;

public class TextScanner {

    public static void main(String args[]) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter your String here: "); //Enter One Two Three
        String s = kbReader.nextLine();
        System.out.println(s);
        kbReader.close();
    }
}

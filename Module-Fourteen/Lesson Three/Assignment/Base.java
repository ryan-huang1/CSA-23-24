public class Base {
    public void methodOne() {
        System.out.print("A");
        methodTwo();
    }

    public void methodTwo() {
        System.out.print("B");
    }

    public static void main(String[] args) {
        Base b = new Derived();
        b.methodOne();
    }
}

class Derived extends Base {
    public void methodOne() {
        super.methodOne(); // Call Base's methodOne(), which prints "A" and then Base's methodTwo(), which
                           // prints "B"
        System.out.print("C");
    }

    public void methodTwo() {
        System.out.print("D");
    }
}

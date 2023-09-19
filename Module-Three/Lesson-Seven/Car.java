public class Car {
    private String make;
    private boolean isSports;
    private String owner;

    public Car (String mk, boolean sports, String own) {
        make = mk;
        isSports = sports;
        owner = own;
    }

    public Car (String mk, boolean sports) {
        make = mk;
        isSports = sports;
        owner = null;
    }
}

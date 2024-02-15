public class Box {
    private double length, height, depth;

    public Box(double length, double height, double depth) {
        this.length = length;
        this.height = height;
        this.depth = depth;
    }

    public double volume() {
        return length * height * depth;
    }

    // Compare this Box to another Box
    public int compareTo(Box other) {
        return Double.compare(this.volume(), other.volume());
    }

    public String toString() {
        return "length: " + length + ",  height: " + height + ",  depth: " + depth + ",  volume: " + volume();
    }
}

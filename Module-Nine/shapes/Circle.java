package shapes;

public class Circle {
    private double radius;

    // Constructor with one argument for radius
    public Circle(double r) {
        this.radius = r;
    }

    // Method to set the radius
    public void setRadius(double nr) {
        this.radius = nr;
    }

    // Method to get the radius
    public double getRadius() {
        return this.radius;
    }

    // Equals method to compare this Circle to another object
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, this.radius) == 0;
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * this.radius;
    }
}

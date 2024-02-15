// Define a Circle class with a constructor that initializes the circle's radius
class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

// The ArrayOfCircles class is used to create and manage an array of Circle objects
public class ArrayOfCircles {
    public static void main(String[] args) {
        // Declare an array to hold 500 Circle objects
        Circle[] cir = new Circle[500];

        // The following line of code is provided for educational purposes.
        // It demonstrates how to initialize a single Circle object at index 117.
        // cir[117] = new Circle(57.2); // This line is now a comment.

        // Populate all 500 circles with a radius of 10 in a loop
        for (int j = 0; j < 500; j++) {
            cir[j] = new Circle(10);
        }

        // Documentation: The above loop efficiently initializes each element in the
        // array 'cir' with a new Circle object with a radius of 10. This method is
        // preferred for initializing a large number of objects because it automates
        // the process and avoids the need to write repetitive code for each object.

        // Answer to the question in a comment:
        // Using a loop to populate 500 circles is easier because it requires less code
        // and is less error-prone than initializing each circle individually. It also
        // makes the code more maintainable and scalable, as the number of circles can
        // be changed easily by adjusting the loop's boundary condition.
    }
}

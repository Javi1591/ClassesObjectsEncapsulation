// Xavier Nazario
// Student ID# 2512208

// Program that tests Triangle class

package nazario9;

public class TriangleTester {

	public static void main(String[] args) {

		// Create a default triangle
		Triangle defaultTriangle = new Triangle();

		// Display results of triangle
		System.out.println("Default Triangle:");
		System.out.println("Side 1: " + defaultTriangle.getSide1());
		System.out.println("Side 2: " + defaultTriangle.getSide2());
		System.out.println("Side 3: " + defaultTriangle.getSide3());
		System.out.println("Area: " + defaultTriangle.getArea());
		System.out.println("Perimeter: " + defaultTriangle.getPerimeter());

		// Create a triangle with specified sides
		Triangle specifiedTriangle = new Triangle(2, 2, 2);

		// Print the properties of the specified triangle
		System.out.println("\nSpecified Triangle:");
		System.out.println("Side 1: " + specifiedTriangle.getSide1());
		System.out.println("Side 2: " + specifiedTriangle.getSide2());
		System.out.println("Side 3: " + specifiedTriangle.getSide3());
		System.out.println("Area: " + specifiedTriangle.getArea());
		System.out.println("Perimeter: " + specifiedTriangle.getPerimeter());
	}

}

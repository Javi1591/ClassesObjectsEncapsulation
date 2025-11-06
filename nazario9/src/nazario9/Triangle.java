// Xavier Nazario
// Student ID# 2512208

// Program for Triangle Class

package nazario9;

public class Triangle {

	// Declare triangle
	// 3 double data fields
	// Sides named side1, side2, side3
	private double side1;
	private double side2;
	private double side3;

	// Construct default rectangle
	// No-arg constructor
	// Use Triangle (Even though Circle)
	// All sides equal to 1
	// Remember "this"
	public Triangle() {
		this(1.0, 1.0, 1.0);
	}

	// Construct triangle with declared sides
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Return method for sides
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// Method getArea() of triangle
	// Use area of triangle formula
	// 1/2(b * h) or perimeter
	public double getArea() {
		double s = getPerimeter() / 2;
		return s; // Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// Method getPerimeter()
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
}

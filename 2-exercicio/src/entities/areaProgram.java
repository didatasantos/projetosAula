package entities;

public class areaProgram {
	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return width * 2 + height * 2;
	}

	public double diagonal() {
		return Math.sqrt(height * width);
	}
	
	public String toString() {
		return String.format("%.2f", area()) + " "+ String.format("%.2f", perimeter()) + " "+ String.format("%.2f", diagonal());
	}
}

package abstractshapeclass;

import java.util.ArrayList;

public class ShapeArray {
	public static void main(String[] args) {
		Sphere sphere = new Sphere(5.6);
		Cone cone = new Cone(7.8, 9.2);
		Cylinder cylinder = new Cylinder(6.7, 8.9);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		for (Shape shape: shapes) {
			System.out.println(shape.toString());
		}
		
	}
}

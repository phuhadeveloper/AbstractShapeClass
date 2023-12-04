package abstractshapeclass;

public class Sphere extends Shape {
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	@Override 
	public double surface_area() {
		return 4*Math.PI*radius*radius;
	}
	
	@Override 
	public double volume() {
		return (4/3.0)*Math.PI*radius*radius*radius;
	}

	@Override
	public String toString() {
		return "Surface Area: " + surface_area() + ", Volume: " + volume();
	}
}

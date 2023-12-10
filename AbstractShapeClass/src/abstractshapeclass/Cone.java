package abstractshapeclass;

public class Cone extends Shape {
	private double radius;
	private double height;
	
	public Cone(double radius, double height){
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double surface_area() {
		return Math.PI*radius*radius + Math.PI*radius*Math.sqrt(radius*radius + height*height);
	}
	
	@Override
	public double volume() {
		return (1/3.0)*Math.PI*radius*radius*height; 
	}
	
	@Override
	public String toString() {
		return "A Cone, Surface Area: " + surface_area() + ", Volume: " + volume();
	}
	
	public static void main(String[] args) {
		
	}
}

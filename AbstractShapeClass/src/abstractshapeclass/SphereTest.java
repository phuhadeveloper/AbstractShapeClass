package abstractshapeclass;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SphereTest {
	private final static double RADIUS = 5.6;
	private final static double SURFACE_AREA = 4*Math.PI*RADIUS*RADIUS;
	private final static double VOLUME = (4/3.0)*Math.PI*RADIUS*RADIUS*RADIUS;
	private final static double EPSILON = 0.000000001;
	
	private final Sphere sphere = new Sphere(RADIUS);
	
	@Test
	public void testSurfaceArea() {
		assertEquals(SURFACE_AREA, sphere.surface_area(), EPSILON);
	}
	
	@Test 
	public void testVolume() {
		assertEquals(VOLUME, sphere.volume(), EPSILON);
	}
}

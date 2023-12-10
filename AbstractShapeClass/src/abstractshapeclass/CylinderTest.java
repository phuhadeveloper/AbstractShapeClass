package abstractshapeclass;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CylinderTest {
	private final static double RADIUS = 5.6;
	private final static double HEIGHT = 7.1;
	private final static double SURFACE_AREA = 2*Math.PI*RADIUS*(RADIUS + HEIGHT);
	private final static double VOLUME = Math.PI*RADIUS*RADIUS*HEIGHT;
	private final static double EPSILON = 0.000000001;
	
	private final Cylinder cylinder = new Cylinder(RADIUS, HEIGHT);
	
	@Test
	public void testSurfaceArea() {
		assertEquals(SURFACE_AREA, cylinder.surface_area(), EPSILON);
	}
	
	@Test
	public void testVolume() {
		assertEquals(VOLUME, cylinder.volume(), EPSILON);
	}

}

package abstractshapeclass;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConeTest {
	private final static double RADIUS = 5.6;
	private final static double HEIGHT = 7.1;
	private final static double SURFACE_AREA = Math.PI*RADIUS*RADIUS + Math.PI*RADIUS*Math.sqrt(RADIUS*RADIUS + HEIGHT*HEIGHT);
	private final static double VOLUME = (1/3.0)*Math.PI*RADIUS*RADIUS*HEIGHT;
	private final static double EPSILON = 0.000000001;
	
	private final Cone cone = new Cone(RADIUS, HEIGHT);
	
	@Test
	public void testSurfaceArea() {
		assertEquals(SURFACE_AREA, cone.surface_area(), EPSILON );
	}
	
	@Test void testVolume() {
		assertEquals(VOLUME, cone.volume(), EPSILON );
	}
}

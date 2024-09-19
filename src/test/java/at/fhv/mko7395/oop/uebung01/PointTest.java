package at.fhv.mko7395.oop.uebung01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PointTest {
    Point p0;
    Point p1;
    Point p2;

    @BeforeAll
    void createPoints() {
        p0 = new Point();
        p1 = new Point(1, 0);
        p2 = new Point(0, 1);
    }

    @Test
    void getNewPointCoordinates() {
        assertEquals(0, p0.getX());
        assertEquals(0, p0.getY());
        assertEquals(1, p1.getX());
        assertEquals(0, p1.getY());
        assertEquals(0, p2.getX());
        assertEquals(1, p2.getY());
    }

    @Test
    void testToString() {
        assertEquals("0,0", p0.toString());
        assertEquals("1,0", p1.toString());
        assertEquals("0,1", p2.toString());
    }
}
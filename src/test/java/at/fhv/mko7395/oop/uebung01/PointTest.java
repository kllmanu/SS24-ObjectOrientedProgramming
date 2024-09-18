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
    void testNewPoint() {
        assertEquals(p0.getX(), 0);
        assertEquals(p0.getY(), 0);
        assertEquals(p1.getX(), 1);
        assertEquals(p1.getY(), 0);
        assertEquals(p2.getX(), 0);
        assertEquals(p2.getY(), 1);
    }

    @Test
    void testToString() {
        assertEquals(p0.toString(), "0,0");
        assertEquals(p1.toString(), "1,0");
        assertEquals(p2.toString(), "0,1");
    }
}
package at.fhv.mko7395.oop.uebung01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RectangleTest {
    Rectangle r1;
    Rectangle r2;

    @BeforeAll
    void createRectangles() {
        r1 = new Rectangle(new Point(5,5), new Point(12, 8));
        r2 = new Rectangle(new Point(3,3), new Point());
    }

    @Test
    @Order(1)
    void getCorners() {
        assertEquals("[5,5, 12,5, 12,8, 5,8]", Arrays.toString(r1.getCorners()));
        assertEquals( "[3,3, 0,3, 0,0, 3,0]", Arrays.toString(r2.getCorners()));
    }

    @Test
    @Order(2)
    void isSquare() {
        assertFalse(r1.isSquare());
        assertTrue(r2.isSquare());
    }

    @Test
    @Order(3)
    void setCorners() {
        r1.move(new Point(2, 2));
        r2.move(new Point(-1, -1));

        assertEquals("[2,2, 9,2, 9,5, 2,5]", Arrays.toString(r1.getCorners()));
        assertEquals("[-1,-1, 2,-1, 2,2, -1,2]", Arrays.toString(r2.getCorners()));
    }

    @Test
    @Order(4)
    void getPerimeter() {
        assertEquals(20, r1.getPerimeter());
        assertEquals(12, r2.getPerimeter());
    }

    @Test
    @Order(5)
    void zoom() {
        r2.zoom(2);

        assertEquals(6, r2.getWidth());
        assertEquals(6, r2.getHeight());
        assertEquals(5, r2.getCorners()[2].getX());
        assertEquals(5, r2.getCorners()[2].getY());
        assertEquals(24, r2.getPerimeter());
    }
}
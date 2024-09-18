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
        r1 = new Rectangle(new Point(5,5), new Point(8, 8));
        r2 = new Rectangle(new Point(3,3), new Point());
    }

    @Test
    @Order(1)
    void getCorners() {
        assertEquals("[5,5, 8,5, 8,8, 5,8]", Arrays.toString(r1.getCorners()));
        assertEquals( "[3,3, 0,3, 0,0, 3,0]", Arrays.toString(r2.getCorners()));
    }

    @Test
    @Order(2)
    void setCorners() {
        r1.move(new Point(10, 10));
        r2.move(new Point(-1, -1));

        assertEquals("[10,10, 8,10, 8,8, 10,8]", Arrays.toString(r1.getCorners()));
        assertEquals("[-1,-1, 0,-1, 0,0, -1,0]", Arrays.toString(r2.getCorners()));
    }
}
package at.fhv.mko7395.oop.uebung01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

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
    void getCorners() {
        assertEquals(Arrays.toString(r1.getCorners()), "[5,5, 8,5, 8,8, 5,8]");
        assertEquals(Arrays.toString(r2.getCorners()), "[3,3, 0,3, 0,0, 3,0]");
    }
}
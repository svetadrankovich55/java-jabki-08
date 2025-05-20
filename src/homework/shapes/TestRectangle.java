package homework.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {

    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(3, 17);
        assertEquals(51, rectangle.area());
    }

    @Test
    void testAreaWithZeroValues() {
        Rectangle rectangle = new Rectangle(0, 7);
        assertEquals(0, rectangle.area());

        rectangle = new Rectangle(8, 0);
        assertEquals(0, rectangle.area());
    }

    @Test
    void teatAreaWithNegativeValues() {
        Rectangle rectangle = new Rectangle(-5, 10);
        assertEquals(50, rectangle.area());
    }

}
package homework.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCircle {

    @Test
    void testAreaWithPositiveRadius() {
        Circle circle = new Circle(5.0);
        double expected = Math.PI * 5.0 * 5.0;
        expected = Math.round(expected * 1000) / 1000.0;
        assertEquals(expected, circle.area());
    }

    @Test
    void testAreaWithZeroRadius() {
        Circle circle = new Circle(0.0);
        assertEquals(0.0, circle.area());
    }

    @Test
    void testAreaRounding() {
        Circle circle = new Circle(1.0);
        assertEquals(3.142, circle.area());
    }

    @Test
    void testConstructorWithNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1.0),
                "Радиус должен быть больше нуля.");
    }
}
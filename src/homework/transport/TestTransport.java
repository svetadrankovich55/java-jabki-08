package homework.transport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTransport {

    @Test
    void testBicycleSpeed() {
        Bicycle bicycle = new Bicycle(40);
        assertEquals(40, bicycle.getSpeed());
    }

    @Test
    void testAirplaneSpeed() {
        Airplane airplane = new Airplane(1000);
        assertEquals(1000, airplane.getSpeed());
    }
}
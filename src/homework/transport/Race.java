package homework.transport;

public class Race {

    public static void startRace(Transport[] vehicles) {
        for (Transport vehicle : vehicles) {
            vehicle.move();
        }
    }
}
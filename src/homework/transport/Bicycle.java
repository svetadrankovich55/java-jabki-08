package homework.transport;

public class Bicycle extends Transport{

    public Bicycle(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Велосипед едет со скоростью " + getSpeed() + " км/ч");
    }
}
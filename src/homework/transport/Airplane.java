package homework.transport;

public class Airplane extends Transport{

    public Airplane(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Самолет летит со скоростью " + getSpeed() + " км/ч");
    }
}
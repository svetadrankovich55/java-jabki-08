package homework.shapes;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус должен быть больше нуля.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.round((Math.PI * radius * radius) * 1000) / 1000.0;
    }

    @Override
    public void displayArea() {
        super.displayArea();
        System.out.println("круга равна: " + area());
    }
}
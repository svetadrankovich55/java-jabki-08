package homework.shapes;

public class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.abs(width * height);
    }

    @Override
    public void displayArea() {
        super.displayArea();
        System.out.println("прямоугольника равна: " + area());
    }

}
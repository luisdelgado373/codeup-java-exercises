package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.println(String.format("The area for your circle is %.2f", circle.getArea()));
        System.out.println(String.format("The circumference for your circle is %.2f", circle.getCircumference()));
    }
}
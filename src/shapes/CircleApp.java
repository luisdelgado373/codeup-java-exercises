package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
// long way for getting double
//        double radius = input.getDouble();
//        Circle circle = new Circle(radius);
        Circle circle = new Circle(input.getDouble("Enter the radius of your circle: "));
        System.out.println(String.format("The area for your circle is %f", circle.getArea()));
        System.out.println(String.format("The circumference for your circle is %f", circle.getCircumference()));
    }
}
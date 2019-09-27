package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setLength(int length) {
        super.length = length;
        super.width = length;
    }

    @Override
    public void setWidth(int width) {
        super.width = width;
        super.length = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * super.length) + (2 * super.width);
    }

    @Override
    public double getArea() {
        return (super.length * super.length);
    }
}

package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public double getArea() {
        return Math.pow(this.length, 2);
    }

    public double getPerimeter() {
        return (4*this.length);
    }
}

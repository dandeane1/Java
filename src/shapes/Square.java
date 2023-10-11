package shapes;

public class Square extends Quadrilateral{


    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    void setLength(double side) {
        setWidth(side);
        this.length = side;
    }

    @Override
    void setWidth(double side) {
        setLength(side);
        this.width = side;
    }
}

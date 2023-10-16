package shapes;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 2 * Math.PI * this.radius;
    }

    public double getCircumference(){
        return Math.PI * (this.radius * this.radius);
    }



}

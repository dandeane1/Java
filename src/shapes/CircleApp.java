package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input localInputObj = new Input();

        System.out.println("What radius is your Circle - plz");

        double circleRadius = localInputObj.getDouble();

        Circle thisCricle = new Circle(circleRadius);

        System.out.println("circumferance~ " + thisCricle.getCircumference() + " :: area~ " + thisCricle.getArea());

    }

}

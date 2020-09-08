import javax.swing.*;

public class circle {
    private double radius;
    double getRadius = 1.0;

    public circle() {
        radius = 4.0;
    }
    public circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
    return  radius*2*Math.PI;
    }
}

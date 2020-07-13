package class_circle_class_cylinder;

public class Circle {
    protected double radius;
    protected String color;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     public double getArea() {
        return this.radius * this.radius * Math.PI;
     }

    @Override
    public String toString() {
        return " A Circle : radius " + getRadius() + " Area : " + getArea();
    }
}

package class_circle_class_cylinder;

public class Cylinder extends Circle {
    protected double height;

    public Cylinder(){
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return " A Cylinder : radius " +
                this.getRadius() + " height : "
                 + this.getHeight() +
                " this volume : " + getVolume();
    }
}

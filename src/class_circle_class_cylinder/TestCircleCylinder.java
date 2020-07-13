package class_circle_class_cylinder;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3,4);
        System.out.println(cylinder);

    }
}

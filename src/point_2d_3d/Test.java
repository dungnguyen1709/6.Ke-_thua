package point_2d_3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1,2.1f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1,3.4f,5f);
        System.out.println(point3D);
    }
}

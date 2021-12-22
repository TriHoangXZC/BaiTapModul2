package LopPoint2DvaLopPoint3D.Test;

import LopPoint2DvaLopPoint3D.Model.Point3D;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(5, 6, 7);
        System.out.println(point3D);

        System.out.println(Arrays.toString(new Point3D(7, 8 ,9).getXYZ()));
//        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}

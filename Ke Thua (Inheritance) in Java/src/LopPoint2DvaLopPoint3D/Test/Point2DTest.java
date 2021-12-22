package LopPoint2DvaLopPoint3D.Test;

import LopPoint2DvaLopPoint3D.Model.Point2D;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 4);
        System.out.println(point2D);

        System.out.println(Arrays.toString(new Point2D(5, 6).getXY()));

//        System.out.println(Arrays.toString(point2D.getXY()));
    }
}

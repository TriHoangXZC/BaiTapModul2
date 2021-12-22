package LopCircleVaLopCylinder.Test;

import LopCircleVaLopCylinder.Model.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(8.0, "aqua", 3.0);
        System.out.println(cylinder);
    }
}

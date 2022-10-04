package baiTap1;

import baiTap1.Circle;
import baiTap1.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println(circle);
        Circle circle1 = new Circle(8.1,"red");
        System.out.println(circle1);

        Cylinder cylinder = new Cylinder(5.4,8.8);
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(9.9, "red",15);
        System.out.println(cylinder1);
    }
}
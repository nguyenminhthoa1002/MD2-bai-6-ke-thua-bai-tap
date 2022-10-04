package baiTap4;

public class Triangle extends Shape{
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "side1=" + super.getSide1() +
                ", side2=" + super.getSide2() +
                ", side3=" + super.getSide3() +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}

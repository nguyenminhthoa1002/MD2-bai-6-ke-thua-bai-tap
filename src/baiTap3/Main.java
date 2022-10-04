package baiTap3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5.4F,3.3F);
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(),2.0F,5.9F);
        System.out.println(moveablePoint);
    }
}

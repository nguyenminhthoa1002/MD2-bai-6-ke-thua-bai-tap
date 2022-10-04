package baiTap3;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0.0F;
        this.y = 0.0F;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY() {
        float[] arr = new float[2];
        return arr;
    }

    public String toString() {
        return "x = "+x +", y = "+y;
    }
}

package baiTap2;

public class Point3D extends Point2D{
    private float z;

    public Point3D() {
        this.z = 0.0F;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y, float z){
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        float[] arrayXYZ = new float[3];
        return arrayXYZ;
    }

    public String toString() {
        return "x = " + super.getX() + ", y = "+super.getY() +", z = "+ this.getZ();
    }
}

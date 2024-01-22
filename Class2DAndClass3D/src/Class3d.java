import java.util.Arrays;

public class Class3d extends Class2D{
    public float[] arr = new float[3];
    protected float z;
    Class3d(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    Class3d(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ() {
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }
    @Override
    public String toString(){
        return  "Class 3D has x= "
                +getX()
                +" y= "
                +getY()
                +" z= "
                + getZ();
    }

}

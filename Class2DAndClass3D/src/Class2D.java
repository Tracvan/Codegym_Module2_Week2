import java.util.Arrays;

public class Class2D {
    float[] arr = new float[2];
    protected float x;
    protected float y;
    Class2D () {
    }
    Class2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public float getY(){
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
         arr[0] = x;
         arr[1] =y;
        return arr;
    }
    public String toString(){
        return  "Class 2D has x= "
                +getX()
                +" y= "
                +arr[1];
    }
}

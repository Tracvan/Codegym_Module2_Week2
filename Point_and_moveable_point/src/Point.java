public class Point {
    float[] arr = new float[2];
    protected float x;
    protected float y;
    Point(){}
    Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        arr[0] = getX();
        arr[1] = getY();
        return arr;
    }
    public String toString(){
        return "Point has x= "
                +getX()
                +" and y= "
                +getY();
    }
}

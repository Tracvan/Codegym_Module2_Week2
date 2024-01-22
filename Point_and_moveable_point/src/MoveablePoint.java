import java.util.Arrays;
import java.util.Objects;

public class MoveablePoint extends Point{
    float[] arr = new float[2];
    float xSpeed;
    float ySpeed;
    MoveablePoint(float xSpeed, float ySpeed,float x, float y){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.x = x;
        this.y = y;
    }
    MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint(){}
    public float getXSpeed(){
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed= xSpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed= ySpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }


/*    this.setX(this.getX() + this.xSpeed);
    this.setY(this.getY() + this.ySpeed);*/
    @Override
    public String toString(){
        return "Moveable point has x= "
                +getX()
                +" and y= "
                +getY()
                +" and speed = "
                + Arrays.toString( getSpeed() )
                +" and after moving the point has x= "
                + movedX
                +" y = "
                + movedY;
    }
    public float movedX;
    public float movedY ;
    public MoveablePoint move(){
      movedX = this.x + xSpeed;
      movedY = this.y + ySpeed;
        return this;
    }
}

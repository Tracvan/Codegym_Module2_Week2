public class Shape {
    protected String color;

    Shape(){}
    public String getColor(){
       return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "This shape's color is "
                +getColor();
    }
}

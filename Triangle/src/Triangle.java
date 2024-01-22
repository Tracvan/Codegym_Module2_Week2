public class Triangle extends Shape{
    double side1 = 1;
    double side2 = 1;
    double side3 = 1;
    double perimeter;
    double area;
    Triangle(){}
    Triangle(double side1, double side2,double side3, String color){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }
    public double getSide1(){
        return this.side1;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide3(){
        return this.side3;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getPerimeter(){
        perimeter = getSide1() + getSide2() + getSide3();
        return perimeter;
    }
    public double getArea(){
        double p = (getSide1() +getSide2() + getSide3())/2;
         area = Math.sqrt(p*(p-side1) * (p-side2) * (p-side3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle has side1= "
                +getSide1()
                +" side2= "
                +getSide2()
                +" and side3= "
                +getSide3()
                +" Triangle's color is "
                +super.getColor()
                +" Area = "
                +getArea()
                +"Perimeter = "
                +getPerimeter();
    }
}

package Project;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea and
    //calculatePerimeter. Create 2 classes Circle & Square that implements
    //functionality defined in the Shape Interface. Test your code
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{
    private double R;
    public Circle(double R) {
        this.R=R;
    }

    public double calculateArea(){
        double area=R*R*3.14;
        System.out.println("Circle area is= "+area);
        return area;
    }
    public double calculatePerimeter(){
        double perimeter=2*3.14*R;
        System.out.println("Circle perimeter is= "+perimeter);
        return perimeter;
    }}
class Square implements Shape{
    private double a;

    public Square(double a) {
        this.a=a;
    }

    @Override
    public double calculateArea() {
        double area=a*a;
        System.out.println("Square area is= "+area);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter=4*a;
        System.out.println("Perimeter of square is= " +perimeter);
        return perimeter;
    }
}

class CircleTester{
    public static void main(String[] args) {
        Circle circle=new Circle(5.2);
        circle.calculatePerimeter();
        circle.calculateArea();
        Square square=new Square(6.3);
        square.calculateArea();
        square.calculatePerimeter();
    }
}

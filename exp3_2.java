// Write a program that defines TriangleArea class with three constructors. The
// first form accepts no arguments. The second accept one double value for
// radius. The third form accepts any two arguments

public class exp3_2 {
    public static void main(String[] args){
        TriangleArea triangle1 = new TriangleArea();
        System.out.println("Area of triangle with default sides: " + triangle1.Area);
        TriangleArea triangle2 = new TriangleArea(5.0);
        System.out.println("Area of equilateral triangle  " + triangle2.Area);

        TriangleArea triangle3 = new TriangleArea(4.0, 6.0);
        System.out.println("Area of triangle  " + triangle3.Area);
        System.out.println("This practical is made by 23CS040-Neel Lathiya");

    }
}

class TriangleArea {
    double Area;

    
    public TriangleArea() {
        Area = 1.0;
        
    }


    public TriangleArea(double side) {
        Area=3.14*side*side;
    }


    public TriangleArea(double base, double height) {
        Area=0.5*base*height;
    }
}    

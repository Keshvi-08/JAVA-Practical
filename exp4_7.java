// Assume you want to capture shapes, which can be either circles (with a
// radiusand a color) or rectangles (with a length, width, and color). You also
// want to be able to create signs (to post in the campus center, for example),
// each of which has a shape (for the background of the sign) and the text (a
// String) to put on the sign. Create classes and interfaces for circles, rectangles,
// shapes, and signs. Write a program that illustrates the significance of interface
// default method

import java. util.*;
public class exp4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Circle c1 = new Circle();
        c1.getInfo();
        c1.displayInfo();
        Rectangle r1 = new Rectangle();
        r1.getInfo();
        r1.displayInfo();


        // Shape circle = new Circle(5, "Red");
        // Shape rectangle = new Rectangle(4, 6, "Blue");

        // Sign circleSign = new Sign(circle, "Welcome to the Circle Zone");
        // Sign rectangleSign = new Sign(rectangle, "Rectangle Area");

        // circleSign.displaySign();
        // System.out.println();
        // rectangleSign.displaySign();
    }

}

interface Shape {
    String getColor();
    double getArea();
    void displayInfo();
    void getInfo();

    // default void displayInfo() {
    //     System.out.println("Shape color: " + getColor());
    //     System.out.println("Shape area: " + getArea());
    // }
}

class Circle implements Shape {
    Scanner sc = new Scanner(System.in);

    double radius;
    String color;

    public void getInfo(){
        System.out.println("enter radius");
        int radius = sc.nextInt();
        System.out.println("enter color");
        String color = sc.nextLine();
    }

//    public Circle(double radius,String color){
//     this.color=color;
//     this.radius=radius;
//    }

   @Override
   public String getColor(){
    return color;
   }

   @Override
   public double getArea(){
    return 3.14*radius*radius;
   }

   @Override
   public void displayInfo(){
    System.out.println("circle color: "+getColor());
    System.out.println("circle radius: "+radius);
    System.out.println("circle area: "+getArea());
   }
}

class Rectangle implements Shape {
    Scanner sc = new Scanner(System.in);
    double length;
    double width;
    String color;

    public void getInfo(){
        System.out.println("enter length");
        int length = sc.nextInt();
        System.out.println("enter width");
        int width = sc.nextInt();
        System.out.println("enter color");
        String color = sc.nextLine();
    }

    // public Rectangle(double length, double width, String color) {
    //     this.length = length;
    //     this.width = width;
    //     this.color = color;
    // }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void displayInfo() {
        System.out.println("Rectangle color: " + getColor());
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + getArea());
    }
}

class Sign {
    Shape shape;
    String text;

    // public Sign(Shape shape, String text) {
    //     this.shape = shape;
    //     this.text = text;
    // }

    public void displaySign() {
        System.out.println("Sign text: " + text);
        shape.displayInfo();
    }
}

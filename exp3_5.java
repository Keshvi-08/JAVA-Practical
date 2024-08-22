// Write a program to print the area of a rectangle by creating a class named
// 'Area' taking the values of its length and breadth as parameters of its
// constructor and having a method named 'returnArea' which returns the area of
// the rectangle. Length and breadth of rectangle are entered through keyboard

import java.util.Scanner;

public class exp3_5 {

    
    public static void main(String[] args){

        int length;
        int breadth;

        Scanner sc = new Scanner(System.in);
    System.out.println("enter length");
    length = sc.nextInt();
    System.out.println("enter breadth");
    breadth = sc.nextInt();
        area a1 = new area(length,breadth);
        a1.returnArea();
        System.out.println("This practical is made by 23CS095-Keshvi siroya");
    }
    
}

class area {
    Scanner sc = new Scanner(System.in);

    int length;
    int breadth;
        
    

    area(int l,int b){
        length=l;
        breadth=b;
    }

    void returnArea(){
        float Area = (length*breadth);
        System.out.println(Area);
    }
}

// Create a class named 'Rectangle' with two data members 'length' and 'breadth'
// and two methods to print the area and perimeter of the rectangle respectively.
// Its constructor having parameters for length and breadth is used to initialize
// length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
// class with its constructor having a parameter for its side (suppose s) calling the
// constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a
// rectangle and a square. Also use array of objects

import java.util.Scanner;

public class exp4_3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    rectangle r1 = new rectangle(5, 4);
    r1.area();
    r1.perimeter();
    square s1 = new square(4);
    s1.area();
    s1.perimeter();
    
    square[] a = new square[10];
    int k = 5;

    for(int i=0;i<10;i++){
        
        a[i] = new square(k);
        k++;
    }

    for(int i=0;i<10;i++){
        a[i].area();
        a[i].perimeter();
    }
}
}

class rectangle {

    int length;
    int width;

    public rectangle(int l,int b){
        length = l;
        width = b;
    }

    public void area(){
        int area = length*width;
        System.out.println("area"+area);
    }

    public void perimeter(){
        int parim = 2*(length+width);
        System.out.println("perimeter"+parim);
    }
}


class square extends rectangle{

    int s;
    public square(int s){
        super(s,s);
    }
    
}

// Write a program that illustrates interface inheritance. Interface P12 inherits
// from both P1 and P2. Each interface declares one constant and one method.
// The class Q implements P12. Instantiate Q and invoke each of its methods.
// Each method displays one of the constants.

import java.util.*;


public class exp4_6 {
    public static void main(String[] args){

        Q ob = new Q();
        ob.printDatap12();
        ob.printDatap1();
        System.out.println(ob.const_p1);
        ob.printDatap2();
        System.out.println(ob.const_p2);
    }
}


interface p1 {
   
    int const_p1=10;
    void printDatap1();
}

/**
 * Innerexp4_6
 */
interface  p2{

    int const_p2=20;
    void printDatap2(); 
}

/**
 * Innerexp4_6
 */
interface p12 extends p1, p2  {

    void printDatap12();
}

class Q implements p12{

    @Override
    public void printDatap1(){
        System.out.println("print p1 data");
    }

    @Override
    public void printDatap2(){
        System.out.println("print p2 data");
    }

    @Override
    public void printDatap12(){
        System.out.println("print p12 data");
    }
}

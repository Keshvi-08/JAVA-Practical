// Write an application that illustrates how to access a hidden variable. Class A
// declares a static variable x. The class B extends A and declares an instance
// variable x. display( ) method in B displays both of these variables

public class exp4_4 {
    public static void main(String[] args){
        B b = new B();
        b.displaydata();
    }

}

class A {
   static int x = 10;    
}

class B extends A{

    int x = 20;
    void displaydata(){
    System.out.println("Static variable x from class A: " + A.x);
    System.out.println("Instance variable x from class B: " + this.x);
    } 
}

// Create a class with a method that prints "This is parent class" and its subclass
// with another method that prints "This is child class". Now, create an object for
// each of the class and call 1 - method of parent class by object of parent class
// 2 - method of child class by object of child class 3 - method of parent class by
// object of child class

public class exp4_1 {

    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
        p.parentstatment();
        c.childstatment();
        c.parentstatment();
    }
    
}

class parent{
     public void parentstatment(){
        System.out.println("this is parent class");
     }
}

class child extends parent{
    public void childstatment(){
       System.out.println("this is child class");
    }
}

// Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
// It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having
// a method with the same name that prints "I am an Undergraduate" and "I am
// a Postgraduate" respectively. Call the method by creating an object of each of
// the three classes

public class exp4_5 {
    
    public static void main(String[] args){
        undergraduat u = new undergraduat();
        postgraduat p = new postgraduat();
        u.getDegree();
        u.printData();
        p.getDegree();
        p.printData();
    }
}

class  degree{

    void getDegree(){
        System.out.println("I got a degree");
    }
    
}

class undergraduat extends degree{

    void printData(){
        System.out.println("I am undergraduat");
    }
}

class postgraduat extends degree{

    void printData(){
        System.out.println("I am postgraduat");
    }
    
}


// Develop minimum 4 program based on variation in methods i.e. passing by
// value, passing by reference, returning values and returning objects from
// methods
//1 program
public class exp3_7_1{
    public static void main(String args[]){
        int x=10;
        System.out.println(x);
        Callbyvalue(x);
        System.out.println(x);
        System.out.println("This Practical is made by 23CS095-Keshvi siroya");
    }

    public static void Callbyvalue(int a)
    {
        a=20;
        System.out.println(a);
    }
}
//2 program
class Myobj{
    int value;
}

public class exp3_7_2 {
    public static void main(String args[]){
        Myobj obj = new Myobj();
        obj.value = 10;
        Callbyrefrence(obj);
        System.out.println(obj.value);
        System.out.println("This Practical is made by 23CS095-Keshvi siroya");
    }
    public static void Callbyrefrence(Myobj o){
        o.value = 20;
    }
}
//3 program
public class exp3_7_3 {
    public static void main(String args[]){
        int x =10;
        int y = 20;
        int sum = callsum(x,y);
        System.out.println(sum);
        System.out.println("This Practical is made by 23CS095-Keshvi siroya");
    }
    static int callsum(int a, int b){
        return a+b;
    }
}
//4 program
class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class exp3_7_4 {
    public static void main(String args[]){
        Person p1 = createPerson("Suzy", 30);
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());  
        System.out.println("This Practical is made by 23CS040-Neel Lathiya"); 
    }
    public static Person createPerson(String name, int age){
        return new Person(name,age);
    }
}





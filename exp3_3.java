// Create a class called Employee that includes three pieces of information as
// instance variables—a first name (type String), a last name (type String) and a
// monthly salary (double). Your class should have a constructor that initializes
// the three instance variables. Provide a set and a get method for each instance
// variable. If the monthly salary is not positive, set it to 0.0. Write a test
// application named EmployeeTest that demonstrates class Employee’s
// capabilities. Create two Employee objects and display each object’s yearly
// salary. Then give each Employee a 10% raise and display each Employee’s
// yearly salary again

import java.util.Scanner;

public class exp3_3{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    employee e1 = new employee();
    e1.setdata();
    e1.getdata();
    e1.salaryrise();
    
    employee emp2 = new employee();
    emp2.setdata();
    emp2.getdata();
    emp2.salaryrise();
    System.out.println("This practical is made by 23CS095-Keshvi siroya");
    }
     
}

 class employee {
    Scanner sc = new Scanner(System.in);
     
    String firstName;
    String lastName;
    double salary;

    public void setdata(){
        

        System.out.println("enter your firstname");
         firstName = sc.nextLine();
        System.out.println("enter your lastname");
         lastName = sc.nextLine();
        System.out.println("enter your salary");
         salary = sc.nextInt();
        
    }

    public void getdata(){
        System.out.println("firstName"+firstName);
        System.out.println("lastName"+lastName);
        if(salary>0){
            System.out.println("salary"+salary);
        }
        else{
            System.out.println(" salary=0.0");
        }

    }

    public void salaryrise(){
        salary=((salary*12)*0.1)+(salary*12);
        System.out.println(salary);
    }
        
}

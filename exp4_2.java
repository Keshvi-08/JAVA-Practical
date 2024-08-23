// Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 – Salary
// It also has a method named 'print Salary' which prints the salary of the
// members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The
// 'Employee' and 'Manager' classes have data members 'specialization' and
// 'department' respectively. Now, assign name, age, phone number, address and
// salary to an employee and a manager by making an object of both of these
// classes and print the same.

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class exp4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //member m1 = new member();
        employee e1 = new employee();
        manager ma1 = new manager();

        e1.enterData();
        ma1.enterData();
        e1.specialization();
        ma1.deparment();
        e1.displaydata();
        ma1.displaydata();
    }
}
    


class member {
    String name;
    int age;
    int phoneNo;
    String address;
    double salary;

    public void enterData(){
        Scanner sc = new Scanner(System.in);
        //new InputStreamReader(System.in);
        Scanner scn = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter phone number");
        phoneNo = sc.nextInt();
        System.out.println("enter address");
        // address = reader.readLine();
        address = scn.nextLine();
        // int it = Integer.parseInt(address.readLine());
        //sc.nextLine();
        System.out.println("enter salary");
        salary = sc.nextLong();
    }

    public void displaydata(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNo);
        System.out.println(address);
        System.out.println(salary);
    }

    public void printSalary(){
        System.out.println(salary);
    }

}

class employee extends member{
    public void specialization(){
        Scanner sc = new Scanner(System.in);
        String spec;
        System.out.println("Enter employee specialization");
        spec = sc.nextLine();

    }
}

class manager extends member {
    public void deparment(){
        Scanner sc = new Scanner(System.in);
        String depa;
        System.out.println("enter department");
        depa = sc.nextLine();
    }

}

// Create a class called Date that includes three pieces of information as instance
// variables—a month (type int), a day (type int) and a year (type int). Your class
// should have a constructor that initializes the three instance variables and
// assumes that the values provided are correct. Provide a set and a get method
// for each instance variable. Provide a method displayDate that displays the
// month, day and year separated by forward slashes (/). Write a test application
// named DateTest that demonstrates class Date’s capabilities

import java.util.Scanner;

public class exp3_4 {
    
    
    public static void main(String[] args){
        data i1 = new data(2,8,2006);
        data i2 = new data(8,22,1888);
        i1.disply();
        i2.disply();
        System.out.println("This practical is made by 23CS095-Keshvi siroya");
    }
   
}

class data {
    int month;
    int day;
    int year;
    data(int m,int d,int y){
        day = d;
        month = m;
        year = y;
    }

    void disply(){
       System.out.println(day+"/"+month+"/"+year);
    }
}

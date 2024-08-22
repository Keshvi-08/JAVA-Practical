// Write a java program for converting Pound into Rupees. (Accept Pounds from
// command line argument and using scanner class also and take 1 Pound = 100
// Rupees.).

import java.util.Scanner;

public class exp3_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        float pound = sc.nextFloat();
        float rupees=pound*100;
        System.out.println(rupees); 
        System.out.println("This practical is made by 23CS040-Neel Lathiya");
    }
}


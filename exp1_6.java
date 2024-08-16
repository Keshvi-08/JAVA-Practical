// Write a program in Java to reverse the digits of a number using while loop.

import java.util.Scanner;
public class exp1_6{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String:");
        int number= sc.nextInt();
        int revnum=0;

        while(number !=0)
        {
            int digit=number%10;
            revnum = revnum * 10 + digit;
            number= number/10;
        }

        System.out.println("Reverse Number:"+ revnum);
        System.out.println("23CS095");
    }
}

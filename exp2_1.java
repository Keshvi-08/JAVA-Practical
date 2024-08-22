// Given a string and a non-negative int n, we'll say that the front of the string is
// the first 3 chars, or whatever is there if the string is less than length 3. Return
// n copies of the front;
// front_times('Chocolate', 2) → 'ChoCho'
// front_times('Chocolate', 3) → 'ChoChoCho'
// front_times('Abc', 3) → 'AbcAbcAbc'.

import java. util.*;
public class exp2_1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your string");
        String str = sc.nextLine();
        System.out.println("enter number");
        int x = sc.nextInt();
        String rec= ("");
        rec=first_time(str,x);
        System.out.println(rec);
        System.out.println("This practical is made by 23CS095-Keshvi Siroya");

    }

    public static String first_time(String str,int n){
        String result = "";
        String s= str.substring(0,3);
        for(int i=0;i<n;i++){
            result=result+" "+s;
        }
        return result;
    } 
}

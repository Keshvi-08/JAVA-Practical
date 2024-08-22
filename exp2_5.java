// Write a program that will reverse the sequence of letters in each word of your
// chosen paragraph. For instance, “To be or not to be” would become “oT eb ro
// ton ot eb”

import java. util.*;

public class exp2_5 {
    public static void main(String[] args) {
        String str = "to be or not to be";
        String arr[]=str.split(" ");
        String r=" ";
        for(int i=0;i<arr.length;i++)
        {
            //String r="";
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                r= r + arr[i].charAt(j);
            }
            
        }
        System.out.println(r + " ");
        System.out.println("This practical is made by 23CS095-Keshvi Siroya");
    }
}

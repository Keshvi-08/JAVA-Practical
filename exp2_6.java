// Perform following functionalities of the string:
// ● Find Length of the String
// ● Lowercase of the String
// ● Uppercase of the String
// ● Reverse String
// ● Sort the string

import java.lang.reflect.Array;
import java.util.*;

public class exp2_6 {
    
    public static void main(String[] args) {
        String str = "this is a notebook";
       // int a = str.length();
        System.out.println(str.length());

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        //System.out.println(str.Short());
       
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    
        String o="";
        for(int i=str.length()-1;i>=0;i--){
            o = o+str.charAt(i);
        }
        System.out.println(o);
        System.out.println("This practical is made by 23CS095-Keshvi Siroya");


    }
}

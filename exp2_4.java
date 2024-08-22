// Given a string, return a string where for every char in the original, there are
// two chars.
// double_char('The') → 'TThhee'
// double_char('AAbb') → 'AAAAbbbb'
// double_char('Hi-There') → 'HHii--TThheerree'

import java. util.*;

public class exp2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your string");
        String str = sc.nextLine();

        String out =("");
        out=double_char(str);
        System.out.println(out);
        System.out.println("This practical is made by 23CS095-Keshvi Siroya");
    }

    public static String double_char(String str){
        String result = "";
        
        
        for(int i=0;i<str.length();i++){
         result = result+ str.charAt(i)+str.charAt(i);
        } 
        return result;
    }
}

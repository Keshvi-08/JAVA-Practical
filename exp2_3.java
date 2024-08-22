// Given an array of ints, return True if one of the first 4 elements in the array is
// a 9. The array length may be less than 4.
// array_front9([1, 2, 9, 3, 4]) → True
// array_front9([1, 2, 3, 4, 9]) → False
// array_front9([1, 2, 3, 4, 5]) → False

import java. util.*;

public class exp2_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        int size = sc.nextInt();
        System.out.println("enter a elements");
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        
        
        System.out.println(array_count(number));
        System.out.println("This practical is made by 23CS095-Keshvi Siroya");
    }

    public  static boolean array_count(int number[]){
        
    
        for(int i=0;i<=3;i++){
            if(number[i]==9){
                return true;
            }
        }

        return true;
        
    }
}



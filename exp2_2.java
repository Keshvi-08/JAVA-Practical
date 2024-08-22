// Given an array of ints, return the number of 9's in the array.
// array_count9([1, 2, 9]) → 1
// array_count9([1, 9, 9]) → 2
// array_count9([1, 9, 9, 3, 9]) → 3

import java. util.*;

public class exp2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        System.out.println("enter a elements");
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int a;
        a= array_count(number, size);
        System.out.println("count of 9 in array"+a);
        System.out.println("This practical is made by 23CS095-Keshvi Siroya");
    }
   
    public  static int array_count(int number[],int n){
        int count=0;
    
        for(int i=0;i<n;i++){
            if(number[i]==9){
                count++;
            }
        }
        return count;
    }
}

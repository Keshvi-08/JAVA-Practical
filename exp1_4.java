// Write an application that creates a two-dimension array with int values. The
// first, second and third elements should be arrays with one, two and three
// numbers respectively. Display the length of each dimension.



public class exp1_4 {
    public static void main(String[] args) 
    {
        int [][] arr={{1},{1,2},{1,2,3}};
        for(int i=0;i<3;i++)
        {
        System.out.print("The Length Of Array "+(i+1)+" Is:");
        System.out.println(arr[i].length);
        System.out.println("23CS095");
        }
    }    
}

//Program: Search Element in 2D Matrix
// Description: This program takes a matrix as input from the user,searches for a number (x), and prints the indices where it occurs
import java.util.*;
public class SearchInTwoDMatrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter no.of rows in array:");
         int rows=sc.nextInt();
         System.out.print("Enter no.of columns in array:");
         int columns=sc.nextInt();
         int Array[][]=new int[rows][columns];
        //  loop for taking input
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Array[i][j]=sc.nextInt();
            }
        }
        // loop for output
        System.out.print("Enter the value that to be searched:");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(Array[i][j]==x){
                  System.out.println("x found at index:"+i+","+j);
                }
            }
        }
     sc.close();
    }
}

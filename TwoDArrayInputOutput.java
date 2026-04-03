//Program: 2D Array Input and Output
//Description: This program takes the size of a 2D array from the user,initializes the array elements using user input, and displays the array.
import java.util.*;
public class TwoDArrayInputOutput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows of an array:");
        int rows=sc.nextInt();
        System.out.print("Enter columns of an array:");
        int columns=sc.nextInt();
        int Array[][]=new int [rows][columns];
        // loop for taking input
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Array[i][j]=sc.nextInt();
            }
        }
        // loop for output
        System.out.println("Output for the array is-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
    }
    sc.close();
}
}
 

// Arrays Practice
// Program to take input in a 1D array and print its elements
import java.util.*;
public class OneDArrayExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array u want:");
        int size=sc.nextInt();
        int[] Marks=new int[size];
        // loop for taking input
        for(int i=0;i<size;i++){
            Marks[i]=sc.nextInt();
        }
        // loop for output
        System.out.println("Here is the output-");
        for(int i=0;i<size;i++){
            System.out.print(Marks[i]+" ");
        }
        sc.close();
    }
}

// Arrays Practice
// Program to search a number in a 1D array using linear search
import java.util.*;
public class LinearSearchInArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size=sc.nextInt();
        int Number[]=new int[size];
        // loop for taking input
        for(int i=0;i<size;i++){
            Number[i]=sc.nextInt();
        }
        // loop for output
        System.out.print("Enter number that u want to search in an array:");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(x==Number[i]){
                System.out.println("Found at index,"+i);
            }
            else{
                System.out.println("not found");
            }
        }
        
        sc.close();
    }
}

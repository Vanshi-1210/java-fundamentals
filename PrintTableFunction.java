// Function to print the multiplication table of a given number
import java.util.*;
public class PrintTableFunction {
    public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        printTable(n);
        sc.close();

    }
}
// Program: Print Multiplication Table
// Description: This program defines a function to print the multiplication table of a given number n entered by the user.
import java.util.*;
public class MultiplicationTableFunction {

    public static void MultiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
         MultiplicationTable(n);
         sc.close();
       
    }
}

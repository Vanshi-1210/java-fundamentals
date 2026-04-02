//Conditional Statements Practice
// Program to take two numbers as input and compare them
// It checks whether numbers are equal, greater, or lesser
import java.util.*;
public class CompareTwoNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
        sc.close();
    }
}
// Program: Check Even Number using Function
// Description: This program defines a function to check whether a given number is even or not.
import java.util.*;
public class EvenNumberFunction {

    public static void checkEvenOdd(int num){
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int num=sc.nextInt();
        checkEvenOdd(num);
        sc.close();
    }
}

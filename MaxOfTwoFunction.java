// This function takes two integers as input and returns the greater of the two.
import java.util.*;
public class MaxOfTwoFunction {

    public static void MaxBetweenTwoNumber(int num1, int num2){
        if(num1>num2){
            System.out.println("num1 is greater");
        }
        else{
            System.out.println("num2 is greater");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        MaxBetweenTwoNumber(num1, num2);
        sc.close();

    }
}
// Functions Practice
// Program to calculate factorial of a number using a function
import java.util.*;
public class FactorialFunction {
    public static int printFactorial(int n){
        int fact=1;
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:"); 
        int n=sc.nextInt();
            int fact=printFactorial(n);
            System.out.println("Factorial of n:"+fact);
            sc.close();
    }
}

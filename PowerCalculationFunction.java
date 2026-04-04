// This function takes two numbers x and n and returns x raised to the power n (x^n).
import java.util.*;
public class PowerCalculationFunction {

    public static double calculatePower(double x,int n){
       double result=Math.pow(x,n);
       System.out.println(result);
       return result;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x:");
        double x=sc.nextDouble();
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        calculatePower(x, n);
        sc.close();

    }
}

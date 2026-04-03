// Functions Practice
// Program to calculate multiplication of two numbers using a function
import java.util.*;
public class MultiplicationFunction {
    public static int calculateMultiplication(int a,int b){
        int mul=a*b;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        int mul=calculateMultiplication(a, b);
        System.out.println("Multiplicatipon of a and b is:"+mul);
        sc.close();
    }
}

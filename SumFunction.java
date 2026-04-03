// Functions Practice
// Program to calculate sum of two numbers using a function
import java.util.*;
public class SumFunction {

    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:");
        int a=sc.nextInt();
        System.out.print("Enter value of b:");
        int b=sc.nextInt();
        int sum=calculateSum(a, b);
        System.out.println("sum of a and b is:"+sum);
      sc.close();
    }
}

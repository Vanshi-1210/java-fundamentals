// Conditional Statements Practice
// Program to check whether a number is even or odd
import java .util.*;
public class EvenOddCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Num is even");
        }
        else{
            System.out.println("num is odd");
        }
        sc.close();
    }
}

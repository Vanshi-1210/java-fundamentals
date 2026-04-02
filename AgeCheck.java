//Conditional Statements Practice
// Program to take age as input and check whether the person is an adult or not
import java.util.*;
public class AgeCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not an Adult");
        }
        sc.close();
    }
}

// Program: Simple Calculator using Switch Case
// Description: This program takes two numbers and an operation choice from the user, performs the calculation, and displays the result.Operations include addition, subtraction, multiplication, division,and modulo.
import java.util.*;
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("press button:");
        int button=sc.nextInt();
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        switch(button){
        //  Addition
        case 1:System.out.println("Addition of a and b is:"+(a+b));
        break;
        
        // subtraction
        case 2:System.out.println("Subtraction of a and b:"+(a-b));
        break;

        // Multiplication
        case 3:System.out.println("Multiplication of a and b is:"+(a*b));
         break;

        // Division
       case 4: System.out.println("Division of a and b is:"+(a/b));
        break;

        // Modulo
         case 5:System.out.println("modulo of a and b is:"+(a%b));
        break;

        default:System.out.println("Invalid button");
        
        }
        sc.close();

    }
}


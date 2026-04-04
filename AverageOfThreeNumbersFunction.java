// Program: Calculate Average of Three Numbers
// Description: This program takes three numbers as input from the user and uses a function to calculate and print their average.
import java.util.*;


public class AverageOfThreeNumbersFunction {

    public static double calculateAverage(int num1,int num2, int num3){
     int sum=num1+num2+num3;
     double avg=sum/3;
     System.out.println(avg);
     return avg;
    }
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=sc.nextInt();
        System.out.print("enter second number:");
        int num2=sc.nextInt();
        System.out.print("enter third number:");
        int num3=sc.nextInt();
        calculateAverage(num1, num2, num3);
        sc.close();

    }
}

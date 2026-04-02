// Loops Practice
// Program to calculate the sum of first n natural numbers
// using for loop, while loop 
import java.util.*;
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num:");
        int num=sc.nextInt();
        // using for loop-
        //    int sum=0;
        // for(int i=1;i<=num;i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);
        int i=1;
        int sum=0;
        while(i<=num){
           sum=sum+i;
           i++;
        }
        System.out.println(sum);
        sc.close();
    }
}

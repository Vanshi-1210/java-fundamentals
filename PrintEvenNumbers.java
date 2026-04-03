// Program: Print Even Numbers Till N
// Description: This program takes a number (n) as input from the user and prints all even numbers from 1 to n using a loop.
import java.util.*;
public class PrintEvenNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
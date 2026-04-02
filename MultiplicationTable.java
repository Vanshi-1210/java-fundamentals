// Loops Practice
// Program to take a number as input and print its multiplication table
// using both for loop and while loop
import java.util.*;
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your num:");
        int num=sc.nextInt();
        // using for loop-
        // for(int i=1;i<=10;i++){
        //     System.out.println(num*i);
        // }
        // using while loop
        // int i=1;
        // while(i<=10){
        //     System.out.println(num*i);
        //     i++;
        // }
        // using do while loop
        int i=1;
        do{
            System.out.println(num*i);
            i++;
        }while(i<=10);
        sc.close();
    }
}
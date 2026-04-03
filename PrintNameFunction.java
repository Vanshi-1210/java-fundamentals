//  Functions Practice
// Program to take a name as input and print it using a function
import java.util.*;
public class PrintNameFunction {

        public static void printMyName(String name){
            System.out.println(name);
            return;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your name:");
            String name=sc.nextLine();
            printMyName(name);
            sc.close();
        }

    }


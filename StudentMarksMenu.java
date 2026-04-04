//Program: Menu Driven Student Marks Evaluation
//Description: This program allows the user to repeatedly enter student marks based on a menu (1 to continue, 0 to stop). It evaluates the marks and prints messages based on performance.
import java.util.*;
public class StudentMarksMenu {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int choice;
        do{
            System.out.print("Enter 1 to input marks or 0 to exit:");
             choice=sc.nextInt();
            if(choice==1){
                System.out.print("Enter marks (0-100): ");
                int marks = sc.nextInt();

            if(marks>=90){
                System.out.println("This is good");
            }
            else if(89 >= marks && marks >= 60){
                System.out.println("THis is also good");
            }
            else if(59 >= marks && marks>= 0){
                System.out.println("This is Good as well");
            }
            else{
                System.out.println("Invalid marks");
            }
        }

    }while(choice!=0);
    System.out.println("Program ended");
    sc.close();
  }

}

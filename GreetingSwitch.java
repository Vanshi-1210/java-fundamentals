// Switch Case Practice
// Program to print greetings based on user input using switch case
// 1 -> Hello
// 2 -> Namaste
// 3 -> Bonjour
import java.util.*;
public class GreetingSwitch {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Press button:");
        int button=sc.nextInt();
        switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid button");
        }
        sc.close();
    }
}

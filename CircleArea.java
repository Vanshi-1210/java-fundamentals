// Program: Calculate Area of a Circle
// Description: This program takes the radius of a circle as input from the user and calculates its area using the formula πr².
import java.util.*;
public class CircleArea {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
        int r=sc.nextInt();
        double area=3.14*r*r;
        System.out.println("Area of circle:"+area);
        sc.close();
    }
}
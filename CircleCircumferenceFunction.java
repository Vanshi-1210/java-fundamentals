// This function takes the radius as input and returns the circumference of the circle
import java.util.*;
public class CircleCircumferenceFunction {

    public static double calculateCircumferenceOfCircle(int r){
        double circumference=2*3.14*r;
        System.out.println("circumference of circle is:"+circumference);
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of radius:");
        int r=sc.nextInt();
        calculateCircumferenceOfCircle(r);
        sc.close();
    }
}

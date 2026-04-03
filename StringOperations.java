// Program: String Operations in Java
// Description: This program demonstrates basic string operations like concatenation, charAt, compareTo, and substring.
// import java.util.*;
public  class StringOperations {

    public static void main(String[] args) {
        // string declaration--
        // String Name="Vanshika";
        // System.out.println(Name);
        // System.out.print("Enter your name:");
        // Scanner sc=new Scanner(System.in);
        // String FullName=sc.nextLine();
        // System.out.println(FullName);
        // sc.close();
         
        //String concatenation
        // String FirstName="Vanshika";
        // String LastName="Agrawal";
        // String FullName=FirstName+" "+LastName;
        // System.out.println(FullName);
        // System.out.println(FullName.length());
        //charAt method
        // for(int i=0;i<FullName.length();i++){
        //     System.out.println(FullName.charAt(i));
        // }

        // compare
        // String name1="Kratika";
        // String name2="Vanshika";
        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // }
        // else if(name1.compareTo(name2)>1){
        //     System.out.println("String 1 is greater");
        // }
        // else if(name1.compareTo(name2)<0){
        //     System.out.println("String 2 is greater");
        // }
        // String Substring
        String Sentence="Hello I am Vanshika Agrawal";
        System.out.println(Sentence.substring(0,5));
        // this prints hello
        System.out.println(Sentence.substring(11));
        // this prints Vanshika Agrawal
    }
}

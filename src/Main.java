import java.util.Scanner;
public static void main (String[] args ){
    Scanner sc = new Scanner (System.in);

    String name, gender;
    int byear;

    System.out.print("Enter name:");
    name = sc.nextLine();
    System.out.print("Enter birth year:");
    byear = sc.nextInt();
    System.out.print("Enter gender: ");
    gender = sc.next();

    System.out.println("Hello "+name+"! Welcome to java!");
    System.out.println("you were born in "+byear+" and your gender is " +gender);
}
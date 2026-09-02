import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Class: ");
        sc.nextLine();
        String className = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Class: " + className);
        System.out.println("Marks: " + marks);

        sc.close();
    }
}

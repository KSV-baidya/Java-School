import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 for equilateral triangle ");
        System.out.print("Enter 2 for isosceles triangle ");
        System.out.print("Enter 3 for scalene triangle ");
        int choice = in.nextInt();
        double area = 0.0;
        switch (choice) {

            case 1: // Equilateral triangle
                System.out.print("Enter the length of the side of the equilateral triangle: ");
                double s = in.nextDouble();
                area = (Math.sqrt(3) * s * s) / 4.0;
                System.out.println("The area of the equilateral triangle is: " + area);
                break;

            case 2: // Isosceles triangle
                System.out.print("Enter the length of the equal sides of the isosceles triangle: ");
                double a = in.nextDouble();
                System.out.print("Enter the length of the base of the isosceles triangle: ");
                double b = in.nextDouble();
                area = b * (Math.sqrt(4 * a * a - (b * b) / 4.0));
                System.out.println("The area of the isosceles triangle is: " + area);
                break;

            case 3: // Scalene triangle
                System.out.print("Enter the lengths of the three sides of the scalene triangle: ");
                double x = in.nextDouble();
                double y = in.nextDouble();
                double z = in.nextDouble();
                double s1 = (x + y + z) / 2.0; // semi perimeter
                area = Math.sqrt(s1 * (s1 - x) * (s1 - y) * (s1 - z));
                System.out.println("The area of the scalene triangle is: " + area);
                break;

            default:
                System.out.println("Invalid choice.");
        }// switch
    }// main
}// class
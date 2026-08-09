import java.util.Scanner;

public class p2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Term Deposit");
        System.out.println("Enter 2 for Recurring Deposit");
        int choice = in.nextInt();
        double amount = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter principal: ");
                int p = in.nextInt();
                System.out.print("Enter rate of interest: ");
                int r = in.nextInt();
                System.out.print("Enter the time period in years: ");
                int n = in.nextInt();
                amount = p * Math.pow(1 + r / 100.0, n);
                System.out.println("Amount = " + amount);
                break;

            case 2:
                System.out.print("Enter monthly instalment: ");
                int P = in.nextInt();
                System.out.print("Enter rate of interest: ");
                int R = in.nextInt();
                System.out.print("Enter the time period in months: ");
                int N = in.nextInt();
                amount = P * N + P * (N * (N + 1) / 2.0) * R / (100.0 * 12);
                System.out.println("Amount = " + amount);
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}
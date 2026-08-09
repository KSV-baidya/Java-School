import java.util.Scanner;

public class TwinPrimeMtd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();

        // confirming that the numbers are twin numbers

        if (check(a, b) == -1) {
            System.out.println("The numbers are not twin numbers. Re-enter the numbers ");
            System.exit(0);
        }
        Prime(a, b);
    }// mains

    // to check they are twin numbers
    static int check(int a, int b) {
        if (a + 2 == b || b + 2 == a)
            return 1;
        else
            return -1;
    }// method for checking the twin numbers

    // Method to check whether both numbers are prime
    static void Prime(int a, int b) {
        boolean primeA = true;
        boolean primeB = true;

        if (a <= 1)
            primeA = false;
        if (b <= 1)
            primeB = false;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                primeA = false;
                break;
            }
        }
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                primeB = false;
                break;
            }
        }

        if (primeA && primeB)
            System.out.println("Both the numbers are twin primes.");
        else
            System.out.println("The numbers are not twin primes.");
    }

}// class


import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("Enter the other number: ");
        int num2 = in.nextInt();

        // write the method name to print the method

    }// mains

    static void Abundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum > num)
            System.out.println("It is an abundant number");
        else
            System.out.println("It is not an abundant number");
    }

    static void neon(int num) {
        int sq = (int) (Math.pow(num, 2));
        int sum = 0;
        while (sq != 0) {
            int last = sq % 10;
            sum += last;
            sq /= 10;
        }
        if (sum == num)
            System.out.println("It is a neon number ");
        else
            System.out.println("It is a neon number ");
    }

    static void armstrong(int num) {
        int temp = num;
        // counting the number of digits
        int x = 0;
        while (num != 0) {
            num /= 10;
            x++;
        }
        num = temp;
        // putting the x variable to each digit of the number
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            sum += (int) (Math.pow(last, x));
            num /= 10;
        }
        // compairing the received value from the input
        if (temp == sum)
            System.out.println("It is an armstrong number ");
        else
            System.out.println("It is not an armstrong number ");
    }

    static void automorphic(int num) {
        int last1 = num % 10;
        int num1 = (int) (Math.pow(num, 2));
        int last2 = num1 % 10;

        if (last1 == last2)
            System.out.println("Yes it is an autoorphic number ");
        else
            System.out.println("Yes it is not an autoorphic number ");
    }

    static void GCF(int num, int num2) {

        int gcf = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && num2 % i == 0) {
                gcf = i;
            }
        }
        System.out.println("The GCF is: " + gcf);
        double lcm = (int) (num * num2) / gcf;
        System.out.println("The LCM is: " + lcm);
    }

    // print the sum of the largest and smallest digit of a number is even or odd
    static void sumOfLargestAndSmallestDigit(int num) {
        int max = 0;
        int min = num % 10;
        while (num != 0) {
            int last = num % 10;
            if (last > max)
                max = last;
            if (last < min)
                min = last;
            num /= 10;
        }
        if ((max + min) % 2 == 0)
            System.out.println("The sum is even");
        else
            System.out.println("The sum is odd ");
    }

    static void PronicNumber(int num) {
        for (int i = 1; i < num; i++) {
            if (i * (i + 1) == num) {
                System.out.println("It is a pronic number ");
                break;
            }
        }
        System.out.println("It is not a pronic number ");
    }

    static void TwistedPrime(int num) {
        int temp = num;
        // reversing the digits
        int rev = 0;
        while (num != 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        num = temp;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                System.out.println("yes the number is a twisted prime ");
                break;
            }
        }
        System.out.println("The number is not a twisted prime.");
    }

    static void Duck(int num) {
        while (num != 0) {
            int last = num % 10;
            if (last == 0) {
                System.out.print("The number is a duck number.");
                break;
            }
            num /= 10;
        }
        System.out.println("The number is not a duck number ");
    }

    static void dudency(int num) {
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            sum += (int) (Math.pow(last, 3));
            num /= 10;
        }
        if (sum == temp)
            System.out.println("The number is dudency ");
        else
            System.out.println("The number is not dudency ");
    }

    // same as niven number
    static void Harshad(int num) {
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }
        if (temp % sum == 0)
            System.out.println("yes it is a niven number ");
        else
            System.out.println("The number is not a niven or harshad number.");
    }

    static void SuperSpy(int num) {
        int temp = num;
        int sum = 0;
        int x = 0;
        while (num != 0) {
            x++; // incrementing the numberr of digits
            // to store the sum of the digits
            int last = num % 10;
            sum += last;
            num /= 10;
        }
        if (sum == x)
            System.out.println("The number is a superspy ");
        else
            System.out.println("The number is not superspy ");
    }

}// class

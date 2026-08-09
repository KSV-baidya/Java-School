import java.util.Scanner;

public class PalinMtd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();
        reverse(num);
    }// MAINS

    static void reverse(int num) {
        int temp = num;
        int rev = 0;
        while (num != 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        if (rev == temp)
            System.out.println("Yes it is a palindrome number ");
        else
            System.out.println("No it is not a palindrome number.");
    }// method

}// class

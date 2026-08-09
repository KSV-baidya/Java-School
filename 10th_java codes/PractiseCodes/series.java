import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of terms for the series ");
        int n = in.nextInt();
        System.out.println("Enter the value of x to continue the series ");
        int x = in.nextInt();
        Sumseries(n, x);
        SumSeries(n);
    }// mains

    static void Sumseries(int n, int x) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                s -= (x / i);
            else
                s += (x / i);
        }
        System.out.println(s);
    } // series1

    static void SumSeries(int n) {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            int term = 1;
            for (int j = 1; j <= i; j++) {
                term *= j;
            }
            s += term;
        }
        System.out.println(s);
    } // series2

}// class
